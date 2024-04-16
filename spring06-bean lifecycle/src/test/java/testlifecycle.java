import lifecycle.Student;
import lifecycle.User;
import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @projectName: spring
 * @package: PACKAGE_NAME
 * @className: testlifecycle
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/18 8:10
 * @version: 1.0
 */
public class testlifecycle {
    @Test
    public void testbeanlifecycle(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        User user = applicationContext.getBean("user", User.class);
        System.out.println(user);
        ClassPathXmlApplicationContext context = (ClassPathXmlApplicationContext) applicationContext;
        context.close();
    }
    @Test
    public void testnew(){
        Student student = new Student();
        System.out.println(student);
        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
        defaultListableBeanFactory.registerSingleton("studentBean",student);
        Student studentBean = defaultListableBeanFactory.getBean("studentBean", Student.class);
        System.out.println(studentBean);
    }

}
