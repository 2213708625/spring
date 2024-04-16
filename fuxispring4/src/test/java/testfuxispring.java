import com.ding.bean.Man;
import com.ding.bean.People;
import com.ding.bean.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.annotation.Target;

/**
 * @projectName: spring
 * @package: PACKAGE_NAME
 * @className: testfuxispring
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/8/17 20:05
 * @version: 1.0
 */
public class testfuxispring {
    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        User user = applicationContext.getBean("user", User.class);
        System.out.println(user);
    }
    @Test
    public void testref(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        People people = applicationContext.getBean("people", People.class);
        System.out.println(people);
    }
    @Test
    public void testannotation(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Man man = applicationContext.getBean("man", Man.class);
        System.out.println(man);
    }
}
