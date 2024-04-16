package annotation.service;

import annotation.mapper.userDao;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @projectName: spring
 * @package: annotation.service
 * @className: userService
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/21 8:50
 * @version: 1.0
 */
@Service("userService")
public class userService {
    @Resource(name = "userDaoimpl")
    private userDao userDao;
    public void generate(){
        userDao.insert();
    }
}
