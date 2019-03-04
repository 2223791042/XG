package mr.s.enums;

public enum  PasswordEnum {
    SUCCESS(0, "密码修改成功"),
    ORIGINAL_ERROR(1, "原始密码错误"),
    FAIL(2, "密码修改失败");
    private Integer code;

    private String message;

    PasswordEnum(Integer code, String message) {
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
