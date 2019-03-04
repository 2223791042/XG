package mr.s.utils;

import mr.s.VO.ResultVO;
import mr.s.enums.ResultEnum;

public class ResultVOUtil {

    public static ResultVO success(Integer code, String msg, Object object){
        return new ResultVO(code, msg, object);
    }

    public static ResultVO success(String msg){
        return success(ResultEnum.SUCCESS.getCode(), msg, null);
    }

    public static ResultVO success(){return success("成功");}

    public static ResultVO fail(Integer code, String msg, Object object){
        return new ResultVO(code, msg, object);
    }

    public static ResultVO fail(String msg){
        return fail(ResultEnum.FAIL.getCode(), msg, null);
    }

    public static ResultVO fail(){return fail("失败");}


}
