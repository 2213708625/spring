package test.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @projectName: spring
 * @package: test.bean
 * @className: UserFactoryBean
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/25 15:03
 * @version: 1.0
 */
public class UserFactoryBean implements FactoryBean<User> {
    @Override
    public User getObject() throws Exception {
        return new User("12","321");
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
