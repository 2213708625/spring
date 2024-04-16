package mybatistest.service;

import mybatistest.bean.Account;

import java.util.List;

/**
 * @projectName: spring
 * @package: mybatistest.service.impl
 * @className: AccountService
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/30 9:31
 * @version: 1.0
 */
public interface AccountService {
    int save(Account account);
    int deleteByactno(String actno);
    int modifyByactno(Account account);
    Account getByactno(String actno);
    List<Account> getAll();
    void transfer(String fromactno, String toactno, Double money);
}
