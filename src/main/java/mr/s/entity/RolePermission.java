package mr.s.entity;

public class RolePermission {
    private Long RPId;

    private Long roleId;

    private Long permissionId;

    public Long getRPId() {
        return RPId;
    }

    public void setRPId(Long RPId) {
        this.RPId = RPId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
    }
}