package mr.s.exception;

import mr.s.enums.ResultEnum;

public class XGException extends RuntimeException{
    private Integer code;

    public XGException(ResultEnum resultEnum){
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
    public XGException(Integer code, String message){
        super(message);
        this.code = code;
    }
}
