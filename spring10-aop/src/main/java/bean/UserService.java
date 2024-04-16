package bean;

import org.springframework.stereotype.Service;

/**
 * @projectName: spring
 * @package: bean
 * @className: UserService
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/25 20:34
 * @version: 1.0
 */
@Service("userService")
public class UserService {
    public void login(){
       /* String s1=null;
        s1.toString();*/
        System.out.println("正在登录");
    }
}
