package Annotation.bean;

/**
 * @projectName: spring
 * @package: Annotation.bean
 * @className: User
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/30 15:13
 * @version: 1.0
 */
public class User {
    private String username;
    private String password;

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
