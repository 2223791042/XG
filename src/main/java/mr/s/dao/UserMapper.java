package mr.s.dao;

import java.util.List;
import java.util.Set;

import mr.s.entity.*;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Long userId);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Long userId);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<Role> selectRoleListByUserId(Long userId);//根据用户id获得所有对应角色

    Set<Permission> selectPermissionListByUserId(Long userId);//根据用户id获得所有对应权限(去重的)

    Long selectMaxId();//获得最大Id

    Set<String> selectPermissionCodeListByUserId(Long userId);//根据用户id获取用户所拥有的全部权限代码
}