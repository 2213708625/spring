package TestAop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @projectName: spring
 * @package: TestAop
 * @className: springconfig
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/29 14:34
 * @version: 1.0
 */
@ComponentScan("TestAop")
@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class springconfig {
}
