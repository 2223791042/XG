package mr.s.service;

import mr.s.dto.MenuDTO;

import java.util.List;

public interface MenuService {

    List<MenuDTO> getList(String userName, String userType);//根据用户名和类型查找菜单
}
