package bean;

import java.io.Serializable;
import java.util.*;

/**
 * @projectName: spring
 * @package: bean
 * @className: User
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/16 12:06
 * @version: 1.0
 */
public class User implements Serializable {
    private String username;
    private String password;
    private String[] aihaos;
    private Women[] womens;
    private List<Integer> houses;
    private Set<String> wifes;
    private Map<Integer,String> wifenames;
    private Properties properties;

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", aihaos=" + Arrays.toString(aihaos) +
                ", womens=" + Arrays.toString(womens) +
                ", houses=" + houses +
                ", wifes=" + wifes +
                ", wifenames=" + wifenames +
                ", properties=" + properties +
                '}';
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void setWifenames(Map<Integer, String> wifenames) {
        this.wifenames = wifenames;
    }

    public void setHouses(List<Integer> houses) {
        this.houses = houses;
    }

    public void setWifes(Set<String> wifes) {
        this.wifes = wifes;
    }

    public void setWomens(Women[] womens) {
        this.womens = womens;
    }

    public User(String username, String password, String[] aihaos) {
        this.username = username;
        this.password = password;
        this.aihaos = aihaos;
    }

    public void setAihaos(String[] aihaos) {
        this.aihaos = aihaos;
    }
    public User() {
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
}
