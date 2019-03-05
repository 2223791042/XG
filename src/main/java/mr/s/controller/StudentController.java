package mr.s.controller;

import mr.s.VO.ResultVO;
import mr.s.dto.MenuDTO;
import mr.s.dto.StudentDTO;
import mr.s.entity.Student;
import mr.s.entity.User;
import mr.s.enums.PasswordEnum;
import mr.s.enums.ResultEnum;
import mr.s.exception.XGException;
import mr.s.form.StudentPersonalInfoForm;
import mr.s.form.StudentRegisterForm;
import mr.s.service.MenuService;
import mr.s.service.StudentService;
import mr.s.service.UserService;
import mr.s.utils.ResultVOUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.List;

/**
 * 菜单控制器
 */
@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private MenuService menuService;

    @Autowired
    private UserService userService;

    @RequiresPermissions("studentPersonal:manage")
    @RequestMapping(value = "/password", method = RequestMethod.GET)
    public String password(Model model){
        String userName = SecurityUtils.getSubject().getPrincipal().toString();
        model.addAttribute("stuID", userName);
        return "student/password";
    }

    /**
     * 学生密码修改
     * @param originalPassword
     * @param password
     * @param httpSession
     * @return
     */
    @ResponseBody
    @RequiresPermissions("studentPersonal:manage")
    @RequestMapping(value = "/password", method = RequestMethod.PUT)
    public ResultVO password(String originalPassword, String password, HttpSession httpSession){
        String userName = SecurityUtils.getSubject().getPrincipal().toString();
        String userType = (String)httpSession.getAttribute("userType");
        try{
            PasswordEnum passwordEnum = userService.editPassword(userName, userType, originalPassword, password);
            if(passwordEnum.equals(PasswordEnum.SUCCESS)){
                return ResultVOUtil.success(passwordEnum.getMessage());
            }
            return ResultVOUtil.fail(passwordEnum.getMessage());
        }catch (RuntimeException e){
            return ResultVOUtil.fail("修改密码失败!");
        }
    }

    /**
     * 学生个人信息修改
     * @param studentPersonalInfoForm
     * @param bindingResult
     * @return
     */
    @ResponseBody
    @RequiresPermissions("studentPersonal:manage")
    @RequestMapping(value = "/personalInfo", method = RequestMethod.PUT)
    public ResultVO personalInfo(@Valid StudentPersonalInfoForm studentPersonalInfoForm, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new XGException(ResultEnum.PARAM_ERROR.getCode(),
                    bindingResult.getFieldError().getDefaultMessage());
        }
        try {
            String stuID = SecurityUtils.getSubject().getPrincipal().toString();
            studentPersonalInfoForm.setStuID(stuID);
            studentService.editPersonalInfo(studentPersonalInfoForm);
        } catch (Exception e) {
            return ResultVOUtil.fail();
        }
        return ResultVOUtil.success();
    }

    /**
     * 学生个人信息查看
     * @param model
     * @return
     */
    @RequiresPermissions("studentPersonal:manage")
    @RequestMapping(value = "/personalInfo", method = RequestMethod.GET)
    public String personalInfo(Model model){
        String stuID = SecurityUtils.getSubject().getPrincipal().toString();
        Student student = studentService.getStudent(stuID);
        model.addAttribute("student", student);
        return "student/personalInfo-edit";
    }

    @RequiresPermissions("student:index")
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(HttpSession httpSession, Model model){
        String userName = SecurityUtils.getSubject().getPrincipal().toString();
        String userType = (String)httpSession.getAttribute("userType");
        List<MenuDTO> menuDTOList = menuService.getList(userName, userType);
        StudentDTO studentDTO = studentService.getStudentDTO(userName);
        model.addAttribute("student", studentDTO);
        model.addAttribute("menus", menuDTOList);
        return "student/index";
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String register(){
        return "student/register";
    }

    @ResponseBody
    @RequestMapping(value = "/checkStuID/{stuID}", method = RequestMethod.GET)
    public ResultVO checkStuID(@PathVariable("stuID") String stuID){
        Student existStudent = studentService.getStudent(stuID);
        if(existStudent != null){
            return ResultVOUtil.success("该学号存在");
        }
        return ResultVOUtil.fail("该学号不存在");
    }

    @ResponseBody
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ResultVO register(@Valid StudentRegisterForm studentRegisterForm, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            throw new XGException(ResultEnum.PARAM_ERROR.getCode(),
                    bindingResult.getFieldError().getDefaultMessage());
        }
        try{
            studentService.register(studentRegisterForm);
        }catch (Exception e){
            return ResultVOUtil.fail();
        }
        return ResultVOUtil.success();
    }
}
