package mr.s.service;

import mr.s.dto.StudentDTO;
import mr.s.entity.Student;
import mr.s.entity.User;
import mr.s.form.StudentRegisterForm;

public interface StudentService {
    StudentDTO getStudentDTO(String userName);//根据学生ID获取学生DTO

    Student getStudent(String stuID);//根据学生ID获取学生实体

    void register(StudentRegisterForm studentRegisterForm);//注册
}
