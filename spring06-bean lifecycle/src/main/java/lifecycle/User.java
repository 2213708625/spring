package lifecycle;

/**
 * @projectName: spring
 * @package: lifecycle
 * @className: User
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/18 8:07
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
        System.out.println("setusername执行");
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        System.out.println("setpassword执行");
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User() {
        System.out.println("user的无参数构造方法执行");
    }
    public void initUserBean(){
        System.out.println("inituserbean");
    }
    public void destroyUserBean(){
        System.out.println("destroyUserBean");
    }
}
