import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @projectName: spring
 * @package: PACKAGE_NAME
 * @className: springconfig
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/20 20:49
 * @version: 1.0
 */
@Component
@ComponentScan({"annotation.bean","annotation.mapper","annotation.service"})
public class springconfig {
}
