package mr.s.entity;

public class User {
    private Long userId;

    private String userName;

    private String userType;

    private String password;

    private String passwordSalt;

    public User() {
    }

    public User(Long userId, String userName, String userType, String password, String passwordSalt) {
        this.userId = userId;
        this.userName = userName;
        this.userType = userType;
        this.password = password;
        this.passwordSalt = passwordSalt;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPasswordSalt() {
        return passwordSalt;
    }

    public void setPasswordSalt(String passwordSalt) {
        this.passwordSalt = passwordSalt == null ? null : passwordSalt.trim();
    }
}