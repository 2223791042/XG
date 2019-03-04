package mr.s.enums;

public enum InquiryStudentEnum {
    SAVE("0", "保存"),
    SUBMIT("1", "提交"),
    EXAMINE("2", "审核"),
    RETURN("3", "退回"),
    IS_RETURN("1", "是退回"),
    WITHDRAW("4", "撤回")
    ;
    private String status;

    private String message;

    InquiryStudentEnum(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }
}
