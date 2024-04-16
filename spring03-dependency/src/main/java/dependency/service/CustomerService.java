package dependency.service;

import dependency.dao.UserDao;

/**
 * @projectName: spring
 * @package: dependency.service
 * @className: CustomerService
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/14 19:42
 * @version: 1.0
 */
public class CustomerService {
    private UserDao userDao;

    public CustomerService(UserDao userDao) {
        this.userDao = userDao;
    }

    public void saveuser(){
        userDao.insert();
    }
}
