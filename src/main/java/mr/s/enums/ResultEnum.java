package mr.s.enums;

public enum ResultEnum {
    SUCCESS(0, "成功"),
    FAIL(100, "失败"),
    PARAM_ERROR(101, "参数错误")
    ;
    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
