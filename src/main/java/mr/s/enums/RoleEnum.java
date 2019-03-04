package mr.s.enums;

public enum RoleEnum {
    STUDENT(1L, "学生"),
    TEACHER(2L, "教师"),
    ADMIN(3L, "管理员")
    ;
    private Long roleId;

    private String info;

    RoleEnum(Long roleId, String info) {
        this.roleId = roleId;
        this.info = info;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
