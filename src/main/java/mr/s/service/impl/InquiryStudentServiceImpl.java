package mr.s.service.impl;

import mr.s.VO.InquiryStudentListVO;
import mr.s.VO.InquiryStudentVO;
import mr.s.converter.EntityToDTOConverter;
import mr.s.dao.InquiryHomeMapper;
import mr.s.dao.InquiryStudentMapper;
import mr.s.dao.StudentMapper;
import mr.s.dto.InquiryStudentDTO;
import mr.s.entity.*;
import mr.s.enums.InquiryStudentEnum;
import mr.s.service.InquiryStudentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class InquiryStudentServiceImpl implements InquiryStudentService {
    @Autowired
    private InquiryStudentMapper inquiryStudentMapper;

    @Autowired
    private InquiryHomeMapper inquiryHomeMapper;

    @Autowired
    private StudentMapper studentMapper;

    public InquiryStudentVO getInquiryStudentVO(String stuID) {
        Student student = studentMapper.selectByPrimaryKey(stuID);//获取学生信息
        InquiryHomeExample inquiryHomeExample = new InquiryHomeExample();
        InquiryHomeExample.Criteria criteria = inquiryHomeExample.createCriteria();
        criteria.andStuIDEqualTo(stuID);
        //获取学生所有家庭成员信息
        List<InquiryHome> inquiryHomeList = inquiryHomeMapper.selectByExample(inquiryHomeExample);
        //获取inquiryStudent信息
        InquiryStudent inquiryStudent = inquiryStudentMapper.selectByPrimaryKey(stuID);

        //进行VO的封装处理
        InquiryStudentVO inquiryStudentVO = new InquiryStudentVO();
        BeanUtils.copyProperties(student, inquiryStudentVO);
        //不为空进行数据拷贝
        if(inquiryStudent != null) {
            BeanUtils.copyProperties(inquiryStudent, inquiryStudentVO);
        }
        inquiryStudentVO.setInquiryHomeList(inquiryHomeList);
        return inquiryStudentVO;
    }

    @Transactional
    public void save(InquiryStudentDTO inquiryStudentDTO) {
        InquiryStudent inquiryStudent = new InquiryStudent();
        BeanUtils.copyProperties(inquiryStudentDTO, inquiryStudent);
        InquiryStudent saveInquiryStudent = inquiryStudentMapper.selectByPrimaryKey(inquiryStudentDTO.getStuID());
        if (saveInquiryStudent == null){
            //进行插入操作
            inquiryStudentMapper.insertSelective(inquiryStudent);
        }else{
            //进行更新操作
            inquiryStudentMapper.updateByPrimaryKeySelective(inquiryStudent);
        }
        //提交的家庭成员信息
        List<InquiryHome> inquiryHomeList = inquiryStudentDTO.getInquiryHomeList();
        InquiryHomeExample homeExample = new InquiryHomeExample();
        InquiryHomeExample.Criteria criteria = homeExample.createCriteria();
        criteria.andStuIDEqualTo(inquiryStudentDTO.getStuID());
        //获取数据库保存的家庭成员信息
        List<InquiryHome> saveInquiryHomeList = inquiryHomeMapper.selectByExample(homeExample);
        //判断是否提交的家庭成员和数据库保存的家庭成员皆为空(直接返回)
        if(inquiryHomeList.size()==0 && saveInquiryHomeList.size()==0){
            return;
        }
        //如果数据库中未保存(则进行插入处理)
        if(saveInquiryHomeList.size()==0){
            for(InquiryHome inquiryHome : inquiryHomeList){
                inquiryHomeMapper.insertSelective(inquiryHome);
            }
            return;
        }
        //现在是数据库中有保存的数据，提交也有保存的数据(进行比对处理)
        for(InquiryHome saveInquiryHome : saveInquiryHomeList){
            boolean flag = false;
            for(InquiryHome inquiryHome : inquiryHomeList){
                if(inquiryHome.getFamilyName().equals(saveInquiryHome.getFamilyName())){
                     BeanUtils.copyProperties(inquiryHome, saveInquiryHome);
                     flag = true;
                }
            }
            if(flag){
                inquiryHomeMapper.updateByPrimaryKeySelective(saveInquiryHome);
            }else{
                inquiryHomeMapper.deleteByPrimaryKey(saveInquiryHome.getInquiryID());
            }
        }
    }

    public List<InquiryStudentListVO> getInquiryStudentListVO(String sort, String order, String stuID, List<String> status) {
        InquiryStudentExample example = new InquiryStudentExample();
        InquiryStudentExample.Criteria criteria = example.createCriteria();
        criteria.andStatusIn(status);
        if(sort != null && order != null){
            sort = sort.substring(0,1).toUpperCase() + sort.substring(1,sort.length());
            String orderBy = sort + " "+order;
            example.setOrderByClause(orderBy);
        }
        if(stuID != null && !stuID.trim().equals("")){
            criteria.andStuIDLike(stuID+"%");
        }
        List<InquiryStudent> inquiryStudentList = inquiryStudentMapper.selectByExample(example);
        List<InquiryStudentListVO> list = new EntityToDTOConverter<InquiryStudent,InquiryStudentListVO>().convert(inquiryStudentList,InquiryStudentListVO.class);
        //添充额外所缺数据
        for(InquiryStudentListVO studentListVO : list){
            Student student = studentMapper.selectByPrimaryKey(studentListVO.getStuID());
            BeanUtils.copyProperties(student, studentListVO);
        }
        return list;
    }

    @Transactional
    public void editInquiryStudent(InquiryStudent inquiryStudent) {
        inquiryStudentMapper.updateByPrimaryKeySelective(inquiryStudent);
    }
}
