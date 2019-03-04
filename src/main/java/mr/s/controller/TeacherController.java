package mr.s.controller;

import mr.s.VO.ResultVO;
import mr.s.dto.MenuDTO;
import mr.s.dto.TeacherDTO;
import mr.s.entity.Teacher;
import mr.s.enums.PasswordEnum;
import mr.s.enums.ResultEnum;
import mr.s.exception.XGException;
import mr.s.form.TeacherPersonalInfoForm;
import mr.s.form.TeacherRegisterForm;
import mr.s.service.MenuService;
import mr.s.service.TeacherService;
import mr.s.service.UserService;
import mr.s.utils.ResultVOUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import javax.xml.transform.Result;
import java.util.List;

@Controller
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @Autowired
    private MenuService menuService;

    @Autowired
    private UserService userService;

    @RequiresPermissions("teacherPersonal:manage")
    @RequestMapping(value = "/password", method = RequestMethod.GET)
    public String password(Model model, HttpSession httpSession){
        String userName = SecurityUtils.getSubject().getPrincipal().toString();
        model.addAttribute("teacherID", userName);
        return "teacher/password";
    }

    /**
     * 教师密码修改
     * @param originalPassword
     * @param password
     * @param httpSession
     * @return
     */
    @ResponseBody
    @RequiresPermissions("teacherPersonal:manage")
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
        }catch (Exception e){
            return ResultVOUtil.fail("修改密码失败!");
        }
    }

    /**
     * 获取个人信息
     * @param model
     * @return
     */
    @RequiresPermissions("teacherPersonal:manage")
    @RequestMapping(value = "/personalInfo", method = RequestMethod.GET)
    public String personalInfo(Model model){
        String teacherID = SecurityUtils.getSubject().getPrincipal().toString();
        Teacher teacher = teacherService.getTeacher(teacherID);
        model.addAttribute("teacher", teacher);
        return "teacher/personalInfo-edit";
    }

    /**
     * 更新教师个人信息
     * @param teacherPersonalInfoForm
     * @param bindingResult
     * @return
     */
    @ResponseBody
    @RequiresPermissions("teacherPersonal:manage")
    @RequestMapping(value = "/personalInfo", method = RequestMethod.PUT)
    public ResultVO personalInfo(@Valid TeacherPersonalInfoForm teacherPersonalInfoForm, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new XGException(ResultEnum.PARAM_ERROR.getCode(),
                    bindingResult.getFieldError().getDefaultMessage());
        }
        try {
            String teacherID = SecurityUtils.getSubject().getPrincipal().toString();
            teacherPersonalInfoForm.setTeacherID(teacherID);
            teacherService.editPersonalInfo(teacherPersonalInfoForm);
        } catch (Exception e) {
            return ResultVOUtil.fail();
        }
        return ResultVOUtil.success();
    }

    /**
     * 获取教师主页
     * @param httpSession
     * @param model
     * @return
     */
    @RequiresPermissions("teacher:index")
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(HttpSession httpSession, Model model){
        String userName = SecurityUtils.getSubject().getPrincipal().toString();
        String userType = (String)httpSession.getAttribute("userType");
        List<MenuDTO> menuDTOList = menuService.getList(userName, userType);
        TeacherDTO teacherDTO = teacherService.getTeacherDTO(userName);
        model.addAttribute("teacher", teacherDTO);
        model.addAttribute("menus", menuDTOList);
        return "teacher/index";
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String register(){
        return "teacher/register";
    }

    /**
     * 检查职工号是否存在
     * @param teacherID
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/checkTeacherID/{teacherID}", method = RequestMethod.GET)
    public ResultVO checkStuID(@PathVariable("teacherID") String teacherID){
        Teacher existTeacher = teacherService.getTeacher(teacherID);
        if(existTeacher != null){
            return ResultVOUtil.success("该职工号存在");
        }
        return ResultVOUtil.fail("该职工号不存在");
    }

    /**
     * 教师注册
     * @param teacherRegisterForm
     * @param bindingResult
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ResultVO register(@Valid TeacherRegisterForm teacherRegisterForm, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            throw new XGException(ResultEnum.PARAM_ERROR.getCode(),
                    bindingResult.getFieldError().getDefaultMessage());
        }
        try{
            teacherService.register(teacherRegisterForm);
        }catch (Exception e){
            return ResultVOUtil.fail();
        }
        return ResultVOUtil.success();
    }


}
