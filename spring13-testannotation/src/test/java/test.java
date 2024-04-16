import Annotation.bean.User;

import Annotation.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;

/**
 * @projectName: spring
 * @package: PACKAGE_NAME
 * @className: test
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/30 15:26
 * @version: 1.0
 */
public class test {
    @Test
    @Transactional
    public void testuser(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springconfig.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.save(new User("dasid213","121"));
        /*String s1= null;
        s1.toString();*/
        /*userService.save(new User("13213","d1321"));*/
    }
}
