package mr.s.service.impl;

import mr.s.converter.EntityToDTOConverter;
import mr.s.dao.StudentMapper;
import mr.s.dao.UserMapper;
import mr.s.dao.UserRoleMapper;
import mr.s.dto.StudentDTO;
import mr.s.entity.Student;
import mr.s.entity.User;
import mr.s.entity.UserRole;
import mr.s.enums.RoleEnum;
import mr.s.form.StudentRegisterForm;
import mr.s.service.StudentService;
import mr.s.utils.PasswordUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Autowired
    private UserRoleMapper userRoleMapper;

    @Autowired
    private UserMapper userMapper;

    public StudentDTO getStudentDTO(String userName) {
        return new EntityToDTOConverter<Student, StudentDTO>().convert(studentMapper.selectByPrimaryKey(userName), StudentDTO.class);
    }

    public Student getStudent(String stuID) {
        return studentMapper.selectByPrimaryKey(stuID);
    }

    @Transactional
    public void register(StudentRegisterForm studentRegisterForm) {
        //保存用户名密码(加密)
        String userName = studentRegisterForm.getStuID();
        String password = studentRegisterForm.getPassword();
        //密码加密
        password = PasswordUtil.encrypt(password,"student");
        Long maxUserId = userMapper.selectMaxId();
        userMapper.insert(new User(maxUserId+1,userName,"student",password,"student"));
        //给予最普通的角色权限(student)
        userRoleMapper.insertSelective(new UserRole(null, maxUserId+1,RoleEnum.STUDENT.getRoleId()));
        //保存学生基本信息
        Student student = new Student();
        BeanUtils.copyProperties(studentRegisterForm, student);
        studentMapper.insertSelective(student);
    }

}
