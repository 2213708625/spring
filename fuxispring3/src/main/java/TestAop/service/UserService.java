package TestAop.service;

import org.springframework.stereotype.Service;

/**
 * @projectName: spring
 * @package: TestAop.service
 * @className: UserService
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/29 14:35
 * @version: 1.0
 */
@Service
public class UserService {
    public void login(){
        //模拟异常
       /* String s1 = null;
        s1.toString();*/
        System.out.println("注册用户中");
    }
}
