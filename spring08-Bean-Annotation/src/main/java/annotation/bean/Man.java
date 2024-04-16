package annotation.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 * @projectName: spring
 * @package: annotation.bean
 * @className: Man
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/20 11:52
 * @version: 1.0
 */
@Component("manBean")
public class Man {
    @Value("丁海斌")
    private String name;
    @Value("111")
    private int password;

    public Man(String name,int password) {
        this.name =name;
        this.password =password;
    }

    public Man() {
        System.out.println("controller");
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", password=" + password +
                '}';
    }
}
