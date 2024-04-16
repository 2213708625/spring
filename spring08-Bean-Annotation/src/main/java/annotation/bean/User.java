package annotation.bean;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @projectName: spring
 * @package: annotation.bean
 * @className: User
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/20 10:31
 * @version: 1.0
 */
@Component("userBean")
public class User {
    private Man man;
    @Resource
    public void setMan(Man man) {
        this.man = man;
    }

    @Override
    public String toString() {
        return "User{" +
                "man=" + man +
                '}';
    }

    public User() {
        System.out.println("component");
    }
}
