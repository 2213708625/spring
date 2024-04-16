import bean.AccountService;
import bean.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @projectName: spring
 * @package: PACKAGE_NAME
 * @className: test
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/25 20:36
 * @version: 1.0
 */
public class test {
    @Test
    public void testaop(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.login();
    }
    @Test
    public void testtransaction(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
        accountService.service();
    }
}
