package mr.s.controller;

import mr.s.VO.ResultVO;
import mr.s.utils.ResultVOUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    /**
     * 获得登录页面
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "/login/user";
    }

    /**
     * 登录处理
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResultVO login(HttpServletRequest request) {
        String verifyCode = request.getParameter("verifyCode");
        verifyCode = verifyCode.toUpperCase();
        HttpSession session = request.getSession();
        String sessionCode = (String) session.getAttribute("verifyCode");
        sessionCode = sessionCode.toUpperCase();
        if(verifyCode!=null&&verifyCode.equals(sessionCode)){
            session.setAttribute("userType",request.getParameter("userType"));
            String username = request.getParameter("userName");
            String password = request.getParameter("password");
            UsernamePasswordToken token = new UsernamePasswordToken(username, password);
            token.setRememberMe(true);
            Subject currentUser = SecurityUtils.getSubject();
            try {
                currentUser.login(token);
                session.setAttribute("userName", username);
            }catch(UnknownAccountException uae){
                return ResultVOUtil.fail("账户不存在!");
            }catch(IncorrectCredentialsException ice){
                return ResultVOUtil.fail("密码错误!");
            } catch(AuthenticationException ae){
                return ResultVOUtil.fail("用户名或密码错误!");
            }
        }else{
            return ResultVOUtil.fail("验证码错误!");
        }
        return ResultVOUtil.success();
    }

    /**
     * 无权限返回页面处理
     * @return
     */
    @RequestMapping(value = "/unauthorized", method = RequestMethod.GET)
    public String unauthorized() {
        return "/unauthorized";
    }

}
