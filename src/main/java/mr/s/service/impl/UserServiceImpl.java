package mr.s.service.impl;
import mr.s.dao.*;
import mr.s.entity.*;
import mr.s.enums.PasswordEnum;
import mr.s.service.UserService;
import mr.s.utils.PasswordUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RoleMapper roleMapper;

    @Autowired
    private RolePermissionMapper rolePermissionMapper;

    @Autowired
    private PermissionMapper permissionMapper;


    public User getUser(String userName, String userType) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUserNameEqualTo(userName);
        criteria.andUserTypeEqualTo(userType);
        List<User> users = userMapper.selectByExample(example);
        if(users.size()!=0){
            return users.get(0);
        }
        return null;
    }

    public List<Role> getRoleList(Long userId) {
        return userMapper.selectRoleListByUserId(userId);
    }

    public Set<Permission> getPermissionList(Long userId) {
        return userMapper.selectPermissionListByUserId(userId);
    }

    public Set<String> getPermissionCodeList(Long userId) {
        return userMapper.selectPermissionCodeListByUserId(userId);
    }

    public List<Role> getRoleList(String sort, String order) {
        RoleExample example = new RoleExample();
        if(sort != null && order != null){
            sort = sort.substring(0,1).toUpperCase() + sort.substring(1,sort.length());
            String orderBy = sort + " " + order;
            example.setOrderByClause(orderBy);
        }
        RoleExample.Criteria criteria = example.createCriteria();
        criteria.andRoleTypeNotEqualTo("admin");
        return roleMapper.selectByExample(example);
    }

    public List<Permission> getPermissionList(String userType) {
        PermissionExample example = new PermissionExample();
        PermissionExample.Criteria criteria = example.createCriteria();
        criteria.andPermissionTypeEqualTo(userType);
        return permissionMapper.selectByExample(example);
    }

    public void addRole(Role role) {
        roleMapper.insertSelective(role);
    }

    public void addPermissionsByRole(Role role, String[] permissionIds) {
        Long roleId =  role.getRoleId();
        RolePermission rolePermission;
        for(int i = 0; i < permissionIds.length; i++){
            rolePermission = new RolePermission();
            rolePermission.setRoleId(roleId);
            rolePermission.setPermissionId(Long.parseLong(permissionIds[i]));
            rolePermissionMapper.insertSelective(rolePermission);
        }
    }

    public void deletePermissionsByRole(Role role) {
        RolePermissionExample example = new RolePermissionExample();
        RolePermissionExample.Criteria criteria = example.createCriteria();
        criteria.andRoleIdEqualTo(role.getRoleId());
        rolePermissionMapper.deleteByExample(example);
    }

    public void updateRole(Role role) {
        roleMapper.updateByPrimaryKeySelective(role);
    }

    public List<Role> getUserRolesByUserType(String userType) {
        RoleExample example = new RoleExample();
        RoleExample.Criteria criteria = example.createCriteria();
        criteria.andRoleTypeEqualTo(userType);
        return roleMapper.selectByExample(example);
    }

    public void updatePermissionsByRole(Role role, String[] permissionIds) {
        deletePermissionsByRole(role);
        addPermissionsByRole(role,permissionIds);
    }

    @Transactional
    public PasswordEnum editPassword(String userName, String userType, String originalPassword, String password) {
        //获取数据库保存的账号信息
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUserNameEqualTo(userName);
        criteria.andUserTypeEqualTo(userType);
        User user = userMapper.selectByExample(userExample).get(0);
        //将用户提交的原始密码加密
        originalPassword = PasswordUtil.encrypt(originalPassword, userType);
        //进行密码比对（成功，修改密码）
        if(user.getPassword().equals(originalPassword)){
            //将用户提交密码加密
            password = PasswordUtil.encrypt(password,userType);
            //密码更新保存
            user.setPassword(password);
            userMapper.updateByPrimaryKeySelective(user);
            //返回成功信息
            return PasswordEnum.SUCCESS;
        }
        //返回原始密码错误信息
        return PasswordEnum.ORIGINAL_ERROR;
    }
}
