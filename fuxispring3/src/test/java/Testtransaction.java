import org.junit.Test;
import transaction.Service.ActService;
import transaction.Service.impl.ActServiceimpl;

/**
 * @projectName: spring
 * @package: PACKAGE_NAME
 * @className: Testtransaction
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/29 15:17
 * @version: 1.0
 */
public class Testtransaction {
    @Test
    public void testransaction(){
         ActService actService = new ActServiceimpl();
         actService.transfer("act001","act002",5000.00);
    }
}
