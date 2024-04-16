import dependency.service.CustomerService;
import dependency.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @projectName: spring
 * @package: PACKAGE_NAME
 * @className: testdependency
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/14 19:18
 * @version: 1.0
 */
public class testdependency {
    @Test
    public void testUserdependency(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = applicationContext.getBean("UserService", UserService.class);
        userService.saveUser();
    }
    @Test
    public void testgouzao(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        CustomerService customerService = applicationContext.getBean("CustomerService", CustomerService.class);
        customerService.saveuser();
    }
}
