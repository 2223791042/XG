package mr.s.service.impl;

import mr.s.dao.MenuMapper;
import mr.s.dto.MenuDTO;
import mr.s.entity.Menu;
import mr.s.entity.MenuExample;
import mr.s.entity.User;
import mr.s.param.MenuParam;
import mr.s.service.MenuService;
import mr.s.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    private UserService userService;

    @Autowired
    private MenuMapper menuMapper;

    public List<MenuDTO> getList(String userName, String userType) {
        //获取用户信息
        User user = userService.getUser(userName, userType);
        //获得一级菜单(并不是真正意义上的一级菜单)
        List<Menu> firstMenuList = menuMapper.selectMenuList(new MenuParam(user.getUserId(),1));
        //获得二级菜单
        List<Menu> secondMenuList = menuMapper.selectMenuList(new MenuParam(user.getUserId(),2));
        List<MenuDTO> menuDTOList = new ArrayList<MenuDTO>();
        for(Menu firstMenu : firstMenuList){
            List<Menu> menuList = new ArrayList<Menu>();
            for(Menu secondMenu : secondMenuList){
                if(secondMenu.getParentId()==firstMenu.getMenuId().intValue()){
                    menuList.add(secondMenu);
                }
            }
            if(menuList.size() > 0){
                MenuDTO menuDTO = new MenuDTO();
                menuDTO.setMenuName(firstMenu.getMenuName());
                menuDTO.setMenuList(menuList);
                menuDTOList.add(menuDTO);
            }
        }
        return menuDTOList;
    }
}
