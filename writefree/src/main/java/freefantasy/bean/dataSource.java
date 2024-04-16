package freefantasy.bean;

/**
 * @projectName: spring
 * @package: freefantasy.bean
 * @className: dataSource
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/16 9:16
 * @version: 1.0
 */
public class dataSource {
    private String driver;
    private String url;
    private String username;
    private String password;

    @Override
    public String toString() {
        return "dataSource{" +
                "driver='" + driver + '\'' +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
