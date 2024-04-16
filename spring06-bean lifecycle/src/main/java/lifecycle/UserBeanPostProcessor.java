package lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @projectName: spring
 * @package: lifecycle
 * @className: UserBeanPostProcessor
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/18 8:28
 * @version: 1.0
 */
public class UserBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Bean后处理器的before");
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Bean后处理器的after");
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
