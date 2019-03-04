package mr.s.controller;

import mr.s.VO.ResultVO;
import mr.s.dto.MenuDTO;
import mr.s.dto.StudentDTO;
import mr.s.entity.Student;
import mr.s.entity.User;
import mr.s.enums.ResultEnum;
import mr.s.exception.XGException;
import mr.s.form.StudentRegisterForm;
import mr.s.service.MenuService;
import mr.s.service.StudentService;
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
