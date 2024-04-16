import cycle.bean.Husband;
import cycle.bean.Wife;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @projectName: spring
 * @package: PACKAGE_NAME
 * @className: testcycle
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/19 10:36
 * @version: 1.0
 */
public class testcycle {
    @Test
    public void testcycledj(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Husband husband = applicationContext.getBean("husband", Husband.class);
        System.out.println(husband);
        Wife wife = applicationContext.getBean("wife", Wife.class);
        System.out.println(wife);

    }
}
