package mr.s.service;

import mr.s.dto.TeacherDTO;
import mr.s.entity.Teacher;
import mr.s.form.TeacherPersonalInfoForm;
import mr.s.form.TeacherRegisterForm;

public interface TeacherService {
    TeacherDTO getTeacherDTO(String userName);

    Teacher getTeacher(String teacherID);

    void register(TeacherRegisterForm teacherRegisterForm);

    void editPersonalInfo(TeacherPersonalInfoForm teacherPersonalInfoForm);//更新个人信息
}
