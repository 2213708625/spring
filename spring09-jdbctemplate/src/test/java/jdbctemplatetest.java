import jdbc.bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @projectName: spring
 * @package: PACKAGE_NAME
 * @className: jdbctemplatetest
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/21 14:09
 * @version: 1.0
 */
public class jdbctemplatetest {
    @Test
    public void testjdbc(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
        String sql ="insert into user values(null,?,?)";
        int update = jdbcTemplate.update(sql,"王五",21);
        System.out.println(update);
    }
    @Test
    public void testjdbcupdate(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
        String sql = "update user set real_name=?,age=? where id=?";
        int i = jdbcTemplate.update(sql, "丁四", 11, 3);
        System.out.println(i);
    }
    @Test
    public void testselectByjdbc(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
        String sql ="select * from user";
        List<User> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));
        for (User user : query) {
            System.out.println(user);
        }
    }
    @Test
    public void testselectcount(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
        String sql = "select count(*) from user";
        Integer integer = jdbcTemplate.queryForObject(sql, int.class);
        System.out.println(integer);
    }
    @Test
    public void testmoreinsert(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
        String sql = "insert into user values(?,?,?)";
        Object[] obj1 ={null,"你",1};
        Object[] obj2 ={null,"我",2};
        Object[] obj3 ={null,"它",3};
        List<Object[]> list = new ArrayList<>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        int[] ints = jdbcTemplate.batchUpdate(sql,list);
        System.out.println(ints);

    }

}
