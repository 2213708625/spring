import freefantasy.bean.User;
import freefantasy.bean.collection;
import freefantasy.bean.dataSource;
import freefantasy.bean.dinghaibin;
import freefantasy.service.UserService;
import org.apache.logging.log4j.core.config.AppendersPlugin;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @projectName: spring
 * @package: PACKAGE_NAME
 * @className: test
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/14 20:01
 * @version: 1.0
 */
public class test {
    @Test
    public void testsimplesetting(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        User user = applicationContext.getBean("user", User.class);
        System.out.println(user);
    }
    @Test
    public void intestbean(){
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("spring.xml");
        UserService userServiceBean = applicationContext.getBean("userServiceBean", UserService.class);
        userServiceBean.SaveUser(1,2);
    }
    @Test
    public void testSpringSetting(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = applicationContext.getBean("UserServiceBean", UserService.class);
       userService.SaveUser(1,2);
    }
    @Test
    public void testarray(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        dinghaibin dhb = applicationContext.getBean("dhb", dinghaibin.class);
        System.out.println(dhb);
    }
    @Test
    public void testlistnames(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        collection listnamesBean = applicationContext.getBean("listnamesBean", collection.class);
        System.out.println(listnamesBean);
    }
    @Test
    public void testnull(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        User user2 = applicationContext.getBean("user2", User.class);
        System.out.println(user2.getPassword());
    }
    @Test
    public void testp(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        User user3 = applicationContext.getBean("user3", User.class);
        System.out.println(user3);
    }
    @Test
    public void testconstructor(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        User user4 = applicationContext.getBean("user4", User.class);
        System.out.println(user4);
    }
    @Test
    public void testjdbc(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-properties.xml");
        dataSource dataSource = applicationContext.getBean("dataSource", dataSource.class);
        System.out.println(dataSource);
    }
}
