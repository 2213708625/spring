package service;

import dao.UserDao;

/**
 * @projectName: spring
 * @package: service
 * @className: userService
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/16 12:11
 * @version: 1.0
 */
public class UserService {
   private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void saveUser(){
       userDao.insert();
   }
}
