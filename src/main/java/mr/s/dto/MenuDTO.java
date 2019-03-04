package mr.s.dto;

import mr.s.entity.Menu;

import java.util.List;

public class MenuDTO {
    private String menuName;
    List<Menu> menuList;

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public List<Menu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<Menu> menuList) {
        this.menuList = menuList;
    }
}
