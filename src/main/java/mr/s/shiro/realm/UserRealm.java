package mr.s.shiro.realm;


import mr.s.entity.User;
import mr.s.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;


public class UserRealm extends AuthorizingRealm{

	@Autowired
	private UserService userService;
	//授权
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		//获取登录时输入的用户名
		String userName=(String)principals.getPrimaryPrincipal();
		//获取当前用户
		Subject currentUser = SecurityUtils.getSubject();
		Session session = currentUser.getSession();
		String userType = (String)session.getAttribute("userType");
		User user = userService.getUser(userName,userType);
		//权限信息对象info,用来存放查出的用户的所有的角色（role）及权限（permission）
		SimpleAuthorizationInfo authorizationInfo=new SimpleAuthorizationInfo();
		//根据用户id获得用户全部权限集合
		Set<String> permissions = userService.getPermissionCodeList(user.getUserId());
		authorizationInfo.setStringPermissions(permissions);
		return authorizationInfo;
	}
	//认证
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		//获取登录时输入的用户名
		String userName=(String)token.getPrincipal();
		Subject currentUser = SecurityUtils.getSubject();
		Session session = currentUser.getSession();
		String userType = (String)session.getAttribute("userType");
		User user = userService.getUser(userName,userType);
		if(user==null){
			throw new UnknownAccountException();
		}
		//这里获取到数据库的用户名密码,然后验证用户名密码，如果不对则执出异常
		SimpleAuthenticationInfo authenticationInfo=new SimpleAuthenticationInfo(
				user.getUserName(),
				user.getPassword(),
				ByteSource.Util.bytes(user.getPasswordSalt()),
				getName());
		return authenticationInfo;
	}

}
