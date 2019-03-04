package mr.s.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import mr.s.VO.InquiryStudentListVO;
import mr.s.VO.InquiryStudentVO;
import mr.s.VO.ResultVO;
import mr.s.VO.TableVO;
import mr.s.dto.InquiryStudentDTO;
import mr.s.entity.InquiryHome;
import mr.s.entity.InquiryStudent;
import mr.s.enums.InquiryStudentEnum;
import mr.s.enums.ResultEnum;
import mr.s.exception.XGException;
import mr.s.form.InquiryStudentForm;
import mr.s.service.InquiryStudentService;
import mr.s.utils.ResultVOUtil;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/inquiryStudent")
public class InquiryStudentController {

    @Autowired
    private InquiryStudentService inquiryStudentService;

    @RequiresPermissions("inquiryStudent:examine")
    @RequestMapping(value = "/look/{stuID}",method = RequestMethod.GET)
    public String look(@PathVariable("stuID") String stuID, Model model){
        InquiryStudentVO inquiryStudentVO = inquiryStudentService.getInquiryStudentVO(stuID);
        model.addAttribute("inquiryStudent", inquiryStudentVO);
        return "teacher/inquiryStudent-detail";
    }

    @RequiresPermissions("inquiryStudent:examine")
    @RequestMapping(value = "/examine/{stuID}",method = RequestMethod.GET)
    public String examine(@PathVariable("stuID") String stuID, Model model){
        InquiryStudentVO inquiryStudentVO = inquiryStudentService.getInquiryStudentVO(stuID);
        model.addAttribute("inquiryStudent", inquiryStudentVO);
        if(inquiryStudentVO.getStatus().equals(InquiryStudentEnum.SUBMIT.getStatus())){
            return "teacher/inquiryStudent-examine";
        }
        return "teacher/inquiryStudent-detail";
    }

    /**
     * 家庭调查表退回
     * @param stuID
     * @return
     */
    @ResponseBody
    @RequiresPermissions("inquiryStudent:examine")
    @RequestMapping(value = "/return/{stuID}",method = RequestMethod.PUT)
    public ResultVO returnInquiryStudent(@PathVariable("stuID")String stuID){
        try{
            InquiryStudent inquiryStudent = new InquiryStudent();
            inquiryStudent.setStuID(stuID);
            inquiryStudent.setStatus(InquiryStudentEnum.RETURN.getStatus());
            inquiryStudent.setReturned(InquiryStudentEnum.IS_RETURN.getStatus());
            inquiryStudentService.editInquiryStudent(inquiryStudent);
        }catch (Exception e){
            return ResultVOUtil.fail();
        }
        return ResultVOUtil.success();
    }

    /**
     * 家庭情况调查表审核
     * @param stuID
     * @return
     */
    @ResponseBody
    @RequiresPermissions("inquiryStudent:examine")
    @RequestMapping(value = "/examine/{stuID}",method = RequestMethod.PUT)
    public ResultVO examine(@PathVariable("stuID")String stuID){
        try{
            InquiryStudent inquiryStudent = new InquiryStudent();
            inquiryStudent.setStuID(stuID);
            inquiryStudent.setStatus(InquiryStudentEnum.EXAMINE.getStatus());
            inquiryStudentService.editInquiryStudent(inquiryStudent);
        }catch (Exception e){
            return ResultVOUtil.fail();
        }
        return ResultVOUtil.success();
    }

    /**
     * 家庭情况调查表分页查询
     * @param type
     * @param page
     * @param limit
     * @param request
     * @return
     */
    @ResponseBody
    @RequiresPermissions("inquiryStudent:examine")
    @RequestMapping(value = "/list/{type}",method = RequestMethod.GET)
    public TableVO<InquiryStudentListVO> listData(@PathVariable("type") String type,int page, int limit, HttpServletRequest request){
        PageHelper.startPage(page, limit);
        String sort = request.getParameter("sort");
        String order = request.getParameter("order");
        String stuID = request.getParameter("stuID");
        List<String> status = new ArrayList<String>();
        if(type.equals("unExamined")){//未审核
            status.add(InquiryStudentEnum.SUBMIT.getStatus());
        }else {//已审核
            status.add(InquiryStudentEnum.EXAMINE.getStatus());
        }
        List<InquiryStudentListVO> list = inquiryStudentService.getInquiryStudentListVO(sort,order,stuID, status);
        PageInfo<InquiryStudentListVO> pageInfo = new PageInfo<InquiryStudentListVO>(list, limit);
        return new TableVO<InquiryStudentListVO>(pageInfo.getTotal(), pageInfo.getList());
    }


    /**
     * 学生家庭调查表录入
     * @param model
     * @param httpSession
     * @return
     */
    @RequiresPermissions("inquiryStudent:input")
    @RequestMapping(value = "/input",method = RequestMethod.GET)
    public String input(Model model, HttpSession httpSession){
        String stuID =(String) httpSession.getAttribute("userName");
        InquiryStudentVO inquiryStudentVO = inquiryStudentService.getInquiryStudentVO(stuID);
        model.addAttribute("inquiryStudent", inquiryStudentVO);
        //如果是没录入或者保存状态的话
        if(inquiryStudentVO.getStatus() == null || inquiryStudentVO.getStatus().equals(InquiryStudentEnum.SAVE.getStatus())){
            return "student/inquiryStudent-edit";
        }
        //否则返回查看详情视图
        return "student/inquiryStudent-detail";
    }

    /**
     * 保存学生家庭信息
     * @param inquiryStudentForm
     * @param httpServletRequest
     * @param httpSession
     * @return
     */
    @ResponseBody
    @RequiresPermissions("inquiryStudent:input")
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public ResultVO save(InquiryStudentForm inquiryStudentForm, HttpServletRequest httpServletRequest, HttpSession httpSession){
        try{
            InquiryStudentDTO inquiryStudentDTO = new InquiryStudentDTO();
            String stuID =(String) httpSession.getAttribute("userName");
            inquiryStudentDTO.setInquiryHomeList(getInquiryHomeList(stuID, httpServletRequest));
            inquiryStudentDTO.setStuID(stuID);
            inquiryStudentDTO.setStatus(InquiryStudentEnum.SAVE.getStatus());
            BeanUtils.copyProperties(inquiryStudentForm, inquiryStudentDTO);
            inquiryStudentService.save(inquiryStudentDTO);
        }catch (Exception e){
            return ResultVOUtil.fail();
        }
        return ResultVOUtil.success();
    }

    /**
     * 学生提交家庭调查表
     * @param inquiryStudentForm
     * @param bindingResult
     * @param httpServletRequest
     * @param httpSession
     * @return
     */
    @ResponseBody
    @RequiresPermissions("inquiryStudent:input")
    @RequestMapping(value = "/submit",method = RequestMethod.POST)
    public ResultVO submit(@Valid InquiryStudentForm inquiryStudentForm, BindingResult bindingResult, HttpServletRequest httpServletRequest, HttpSession httpSession) {
        if(bindingResult.hasErrors()){
            throw new XGException(ResultEnum.PARAM_ERROR.getCode(),
                    bindingResult.getFieldError().getDefaultMessage());
        }
        try {
            InquiryStudentDTO inquiryStudentDTO = new InquiryStudentDTO();
            String stuID =(String) httpSession.getAttribute("userName");
            inquiryStudentDTO.setInquiryHomeList(getInquiryHomeList(stuID, httpServletRequest));
            inquiryStudentDTO.setStuID(stuID);
            inquiryStudentDTO.setStatus(InquiryStudentEnum.SUBMIT.getStatus());
            BeanUtils.copyProperties(inquiryStudentForm, inquiryStudentDTO);
            inquiryStudentService.save(inquiryStudentDTO);
        }catch (Exception e){
            return ResultVOUtil.fail();
        }
        return ResultVOUtil.success();
    }

    /**
     * 从request中取得数据进行数据封装，获得inquiryHomeList
     * @param httpServletRequest
     * @return
     */
    public List<InquiryHome> getInquiryHomeList(String stuID, HttpServletRequest httpServletRequest){
        String[] familyNameList = httpServletRequest.getParameterValues("familyName");
        String[] ageList = httpServletRequest.getParameterValues("age");
        String[] relationList = httpServletRequest.getParameterValues("relation");
        String[] workPlaceList = httpServletRequest.getParameterValues("workPlace");
        String[] occupationList = httpServletRequest.getParameterValues("occupation");
        String[] incomeList = httpServletRequest.getParameterValues("income");
        List<InquiryHome> inquiryHomeList = new ArrayList<InquiryHome>();
        if(familyNameList == null){
            return inquiryHomeList;
        }
        for(int i = 0; i < familyNameList.length; i++){
            if(!familyNameList[i].trim().equals("")) {
                InquiryHome inquiryHome = new InquiryHome();
                inquiryHome.setStuID(stuID);
                inquiryHome.setFamilyName(familyNameList[i]);
                inquiryHome.setAge(Integer.parseInt(ageList[i]));
                inquiryHome.setRelation(relationList[i]);
                inquiryHome.setWorkPlace(workPlaceList[i]);
                inquiryHome.setOccupation(occupationList[i]);
                inquiryHome.setIncome(Float.parseFloat(incomeList[i]));
                inquiryHomeList.add(inquiryHome);
            }
        }
        return inquiryHomeList;
    }

    @RequiresPermissions("inquiryStudent:examine")
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String list(){
        return "teacher/inquiryStudent-list";
    }
}
