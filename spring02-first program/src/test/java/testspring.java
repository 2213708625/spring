import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.*;

/**
 * @projectName: spring
 * @package: PACKAGE_NAME
 * @className: testspring
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/14 12:51
 * @version: 1.0
 */
public class testspring {
    @Test
    public void testSpringBean(){
        //获取spring容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Object userBean = applicationContext.getBean("UserBean");
        System.out.println(userBean);
        Logger logger = LoggerFactory.getLogger(testspring.class);
        logger.info("testSpringBean");
    }
}
