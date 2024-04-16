package transaction.Service.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.transaction.annotation.Transactional;
import transaction.Service.ActService;
import transaction.bean.Act;
import transaction.dao.ActMapper;
import transaction.util.sqlsessionutil;

/**
 * @projectName: spring
 * @package: transaction.Service.impl
 * @className: ActServiceimpl
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/29 15:08
 * @version: 1.0
 */
public class ActServiceimpl implements ActService {
    @Override
    @Transactional
    public void transfer(String fromactno, String toactno,Double money) {
          //先判断要转出的账户是否余额充足
        SqlSession sqlSession = sqlsessionutil.opensession();
        ActMapper mapper = sqlSession.getMapper(ActMapper.class);
        Act fromact = mapper.selectByactno(fromactno);
        Act toact = mapper.selectByactno(toactno);
        if (fromact.getBalance()<money) {
           throw new RuntimeException("先生您的余额不足");
        }
        fromact.setBalance(fromact.getBalance()-money);
        toact.setBalance(toact.getBalance()+money);
        mapper.updateact(fromact);
        //模拟空指针异常
        /*String s1 =null;
        s1.toString();*/
        mapper.updateact(toact);
    }
}
