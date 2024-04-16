import bean.DataSource;
import bean.User;
import bean.Women;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;

/**
 * @projectName: spring
 * @package: PACKAGE_NAME
 * @className: test
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/16 12:05
 * @version: 1.0
 */
public class test {
    @Test//测试set注入
    public void simpleUser() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springfuxi.xml");
        User user = applicationContext.getBean("user", User.class);
        System.out.println(user);
    }

    @Test//测试构造注入
    public void constructorUser() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springfuxi.xml");
        User userconstructor = applicationContext.getBean("userconstructor", User.class);
        System.out.println(userconstructor);
    }

    @Test//测试使用set注入另一个引入类型
    public void twosimpleUser() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springfuxi.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.saveUser();
    }

    @Test//测试set注入数组简单类型
    public void userarray() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springfuxi.xml");
        User userarray = applicationContext.getBean("userarray", User.class);
        System.out.println(userarray);
    }

    @Test//测试时set注入引入类型
    public void testuserarraywomen() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springfuxi.xml");
        User userarraywomen = applicationContext.getBean("userarraywomen", User.class);
        System.out.println(userarraywomen);
    }

    @Test//测试set注入list集合和set集合
    public void testlistandset() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springfuxi.xml");
        User listandset = applicationContext.getBean("listandset", User.class);
        System.out.println(listandset);
    }

    @Test//测试set注入Map集合
    public void testmap() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springfuxi.xml");
        User userMap = applicationContext.getBean("userMap", User.class);
        System.out.println(userMap);
    }

    @Test//测试set注入properties集合
    public void testproperties() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springfuxi.xml");
        User userProperties = applicationContext.getBean("userProperties", User.class);
        System.out.println(userProperties);
    }

    @Test//测试set注入properties集合与datasource结合
    public void testdataSource() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springfuxi.xml");
        DataSource dataSource = applicationContext.getBean("dataSource", DataSource.class);
        System.out.println(dataSource);
    }

    @Test//测试p命名空间
    public  void testp(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springfuxi.xml");
        User userp = applicationContext.getBean("userp", User.class);
        System.out.println(userp);
    }
    @Test//测试c命名空间
    public  void testc(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springfuxi.xml");
        Women womenc = applicationContext.getBean("womenc", Women.class);
        System.out.println(womenc);
    }
    @Test//测试util命名空间
    public void testutil(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springfuxi.xml");
        User userutil = applicationContext.getBean("userutil", User.class);
        System.out.println(userutil);
    }
    @Test//测试根据名字自动装配
    public void testuserautowire(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springfuxi.xml");
        User userautowire = applicationContext.getBean("userautowire", User.class);
        System.out.println(userautowire);
    }

}

