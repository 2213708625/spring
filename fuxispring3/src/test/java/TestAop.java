import TestAop.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import TestAop.springconfig;

/**
 * @projectName: spring
 * @package: PACKAGE_NAME
 * @className: TestAop
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/29 14:38
 * @version: 1.0
 */
public class TestAop {
    @Test
    public void testaop(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(springconfig.class);
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.login();
    }
}
