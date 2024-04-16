package dependency.service;

import dependency.dao.UserDao;

/**
 * @projectName: spring
 * @package: dependency.service
 * @className: UserService
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/14 19:15
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
