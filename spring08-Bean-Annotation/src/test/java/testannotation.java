import annotation.bean.Man;
import annotation.bean.User;
import annotation.service.userService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @projectName: spring
 * @package: PACKAGE_NAME
 * @className: testannotation
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/20 10:32
 * @version: 1.0
 */
public class testannotation {
    @Test
    public void testannotation(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        User userBean = applicationContext.getBean("userBean", User.class);
        System.out.println(userBean);
    }
    @Test
    public void choose(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Man man = applicationContext.getBean("manBean", Man.class);
        System.out.println(man);

    }
    @Test
    public void testResource(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        User userBean = applicationContext.getBean("userBean", User.class);
        System.out.println(userBean);
    }
    @Test
    public void testnoxml(){

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(springconfig.class);
        User userBean = context.getBean("userBean", User.class);
        System.out.println(userBean);
    }
    @Test
    public void testimpl(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(springconfig.class);
        userService userService = context.getBean("userService", userService.class);
        userService.generate();
    }

}
