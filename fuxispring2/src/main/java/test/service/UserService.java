package test.service;

import test.mapper.UserMapper;

/**
 * @projectName: spring
 * @package: test.service
 * @className: UserService
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/25 14:06
 * @version: 1.0
 */
public class UserService {
    private UserMapper userMapper;


    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public void generate(){
      userMapper.insert();
    }
}
