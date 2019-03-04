package mr.s.service;

import mr.s.entity.Permission;
import mr.s.entity.Role;
import mr.s.entity.User;
import mr.s.enums.PasswordEnum;

import java.util.List;
import java.util.Set;

public interface UserService {

    User getUser(String userName, String userType);//获得用户

    List<Role> getRoleList(Long userId);//根据用户id获得用户所拥有的全部角色

    Set<Permission> getPermissionList(Long userId);//根据用户id获取用户所拥有的全部权限

    Set<String> getPermissionCodeList(Long userId);//根据用户id获取用户所拥有的全部权限代码

    List<Role> getRoleList(String sort, String order);//获得所有角色信息

    List<Permission> getPermissionList(String userType);//根据用户类型获得对应全部权限

    void addRole(Role role);//添加角色

    void addPermissionsByRole(Role role, String[] permissionIds);//为角色添加权限

    void deletePermissionsByRole(Role role);//删除角色权限

    void updateRole(Role role);//更新角色

    void updatePermissionsByRole(Role role, String[] permissionIds);//更新角色权限

    List<Role> getUserRolesByUserType(String userType);//根据用户类型获得所有的角色

    PasswordEnum editPassword(String userName, String userType, String originalPassword, String password);//修改密码
}
