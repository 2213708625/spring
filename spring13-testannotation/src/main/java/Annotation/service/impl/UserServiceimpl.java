package Annotation.service.impl;

import Annotation.bean.User;
import Annotation.mapper.UserMapper;
import Annotation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @projectName: spring
 * @package: Annotation.service.impl
 * @className: UserServiceimpl
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/30 15:25
 * @version: 1.0
 */
@Service("userService")
public class UserServiceimpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public int save(User user) {
        return userMapper.insert(user);
    }

}
