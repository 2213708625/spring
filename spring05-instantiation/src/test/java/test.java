import instantiation.Gun;
import instantiation.Star;
import instantiation.Student;
import instantiation.Vip;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @projectName: spring
 * @package: PACKAGE_NAME
 * @className: test
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/17 12:54
 * @version: 1.0
 */
public class test {
    @Test
    public void testsimplefactory(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Star starBean = applicationContext.getBean("starBean", Star.class);
        System.out.println(starBean);
    }
    @Test
    public void testfactorybean(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Gun gunbean = applicationContext.getBean("gunbean", Gun.class);
        System.out.println(gunbean);
    }
    @Test
    public void testbeanfactory(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Vip vip = applicationContext.getBean("vip", Vip.class);
        System.out.println(vip);
    }
    @Test
    public void teststudentbirth(){
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Student student = applicationContext.getBean("student", Student.class);
        System.out.println(student);
    }
}
