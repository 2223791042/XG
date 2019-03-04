package mr.s.service;


import mr.s.VO.InquiryStudentListVO;
import mr.s.VO.InquiryStudentVO;
import mr.s.dto.InquiryStudentDTO;
import mr.s.entity.InquiryStudent;

import java.util.List;

public interface InquiryStudentService {
    InquiryStudentVO getInquiryStudentVO(String stuID);//根据学号获取家庭调查表VO

    void save(InquiryStudentDTO inquiryStudentDTO);//保存inquiryStudentDTO

    //分页条件查询
    List<InquiryStudentListVO> getInquiryStudentListVO(String sort, String order, String stuID, List<String> status);

    void editInquiryStudent(InquiryStudent inquiryStudent);//修改家庭调查表
}
