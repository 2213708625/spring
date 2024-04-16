package instantiation;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.cglib.proxy.Factory;

/**
 * @projectName: spring
 * @package: instantiation
 * @className: Vipfactorybean
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/17 13:32
 * @version: 1.0
 */
public class Vipfactorybean implements FactoryBean<Vip> {
    @Override
    public Vip getObject() throws Exception {
        return new Vip();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
