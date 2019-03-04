package mr.s.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;


@ControllerAdvice
public class UnauthorizedException {
    @ExceptionHandler({org.apache.shiro.authz.UnauthorizedException.class})
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public ModelAndView processUnauthenticatedException(org.apache.shiro.authz.UnauthorizedException e){
        ModelAndView mav=new ModelAndView("unauthorized");
        mav.addObject("exception", e);
        return mav;
    }
}