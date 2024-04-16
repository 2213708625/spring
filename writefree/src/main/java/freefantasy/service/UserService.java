package freefantasy.service;

import freefantasy.dao.UserDao;

/**
 * @projectName: spring
 * @package: freefantasy.service
 * @className: UserService
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/14 20:09
 * @version: 1.0
 */
public class UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void SaveUser(int a,int b){
        int sum = userDao.sum(a,b);
        System.out.println(sum);
    }
}
