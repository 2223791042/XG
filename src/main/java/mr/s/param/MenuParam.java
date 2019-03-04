package mr.s.param;

public class MenuParam {
    private Long userId;
    private Integer menuLevel;

    public MenuParam() {
    }

    public MenuParam(Long userId, Integer menuLevel) {
        this.userId = userId;
        this.menuLevel = menuLevel;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getMenuLevel() {
        return menuLevel;
    }

    public void setMenuLevel(Integer menuLevel) {
        this.menuLevel = menuLevel;
    }
}
