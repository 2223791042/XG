package mr.s.entity;

public class UserRole {
    private Long URid;

    private Long userId;

    private Long roleId;

    public UserRole() {
    }

    public UserRole(Long URid, Long userId, Long roleId) {
        this.URid = URid;
        this.userId = userId;
        this.roleId = roleId;
    }

    public Long getURid() {
        return URid;
    }

    public void setURid(Long URid) {
        this.URid = URid;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}