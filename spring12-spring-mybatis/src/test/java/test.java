import mybatistest.bean.Account;
import mybatistest.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @projectName: spring
 * @package: PACKAGE_NAME
 * @className: test
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/30 10:01
 * @version: 1.0
 */
public class test {
    @Test
    public void testmybatis() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        AccountService accountServiceimpl = applicationContext.getBean("accountServiceimpl", AccountService.class);
        List<Account> all = accountServiceimpl.getAll();
        for (Account account : all) {
            System.out.println(account);
        }
    }

    @Test
    public void testspring() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        AccountService accountServiceimpl = applicationContext.getBean("accountServiceimpl", AccountService.class);
        accountServiceimpl.transfer("act001", "act002", 5000.00);
    }
}

