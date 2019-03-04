package mr.s.service.impl;

import mr.s.converter.EntityToDTOConverter;
import mr.s.dao.TeacherMapper;
import mr.s.dao.UserMapper;
import mr.s.dao.UserRoleMapper;
import mr.s.dto.TeacherDTO;
import mr.s.entity.Teacher;
import mr.s.entity.User;
import mr.s.entity.UserRole;
import mr.s.enums.RoleEnum;
import mr.s.form.TeacherPersonalInfoForm;
import mr.s.form.TeacherRegisterForm;
import mr.s.service.TeacherService;
import mr.s.utils.PasswordUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherMapper teacherMapper;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserRoleMapper userRoleMapper;

    public Teacher getTeacher(String teacherID) {
        return teacherMapper.selectByPrimaryKey(teacherID);
    }

    public TeacherDTO getTeacherDTO(String userName) {
        return new EntityToDTOConverter<Teacher, TeacherDTO>().convert(teacherMapper.selectByPrimaryKey(userName), TeacherDTO.class);
    }

    public void register(TeacherRegisterForm teacherRegisterForm) {
        //保存用户名密码(加密)
        String userName = teacherRegisterForm.getTeacherID();
        String password = teacherRegisterForm.getPassword();
        //密码加密
        password = PasswordUtil.encrypt(password,"teacher");
        Long maxUserId = userMapper.selectMaxId();
        userMapper.insert(new User(maxUserId+1,userName,"teacher",password,"teacher"));
        //给予最普通的角色权限(teacher)
        userRoleMapper.insertSelective(new UserRole(null, maxUserId+1,RoleEnum.TEACHER.getRoleId()));
        //保存教师基本信息
        Teacher teacher = new Teacher();
        BeanUtils.copyProperties(teacherRegisterForm, teacher);
        teacherMapper.insertSelective(teacher);
    }

    @Transactional
    public void editPersonalInfo(TeacherPersonalInfoForm teacherPersonalInfoForm) {
        Teacher teacher = new Teacher();
        BeanUtils.copyProperties(teacherPersonalInfoForm, teacher);
        teacherMapper.updateByPrimaryKeySelective(teacher);
    }
}
