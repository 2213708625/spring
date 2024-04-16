package transaction.Service;

/**
 * @projectName: spring
 * @package: transaction.Service
 * @className: ActService
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/29 15:07
 * @version: 1.0
 */
public interface ActService {
    void transfer(String fromactno,String toactno,Double money);
}
