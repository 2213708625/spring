package mybatistest.service.impl;

import mybatistest.bean.Account;
import mybatistest.mapper.AccountMapper;
import mybatistest.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @projectName: spring
 * @package: mybatistest.service.impl
 * @className: AccountServiceimpl
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/30 9:33
 * @version: 1.0
 */
@Service
@Transactional
public class AccountServiceimpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;
    @Override
    public int save(Account account) {
        return accountMapper.insert(account);
    }

    @Override
    public int deleteByactno(String actno) {
        return accountMapper.deleteByactno(actno);
    }

    @Override
    public int modifyByactno(Account account) {
        return accountMapper.updateByactno(account);
    }

    @Override
    public Account getByactno(String actno) {
        return accountMapper.selectByactno(actno);
    }

    @Override
    public List<Account> getAll() {
        return accountMapper.selectall();
    }

    @Override
    public void transfer(String fromactno, String toactno, Double money) {
        Account fromact = accountMapper.selectByactno(fromactno);
        Account toact = accountMapper.selectByactno(toactno);
        if(fromact.getBalance()<money){
            throw new RuntimeException("您的余额不足");
        }
        fromact.setBalance(fromact.getBalance()-money);
        toact.setBalance(toact.getBalance()+money);
        int i = accountMapper.updateByactno(fromact);
        /*String s1= null;
        s1.toString();*/
        i+=accountMapper.updateByactno(toact);
        if(i==2){
            System.out.println("转账成功");
        }else{
            throw new RuntimeException("转账失败");
        }
    }
}
