package mybatistest.mapper;

import mybatistest.bean.Account;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @projectName: spring
 * @package: mybatistest.mapper
 * @className: AccountMapper
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/30 9:20
 * @version: 1.0
 */
@Repository
public interface AccountMapper {
    int insert(Account account);
    int deleteByactno(String actno);
    int updateByactno(Account account);
    Account selectByactno(String actno);
    List<Account> selectall();
}
