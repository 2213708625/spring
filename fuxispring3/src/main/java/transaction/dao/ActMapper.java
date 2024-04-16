package transaction.dao;

import transaction.bean.Act;

/**
 * @projectName: spring
 * @package: transaction.dao
 * @className: ActMapper
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/29 15:01
 * @version: 1.0
 */
public interface ActMapper {
    Act selectByactno(String actno);

    int updateact(Act act);
}
