package test.bean;

/**
 * @projectName: spring
 * @package: test.bean
 * @className: User
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/25 13:55
 * @version: 1.0
 */
public class User {
    private String name;
    private String password;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }
}
