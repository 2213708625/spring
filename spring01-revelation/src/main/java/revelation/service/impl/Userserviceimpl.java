package revelation.service.impl;

import revelation.mapper.UserDao;
import revelation.mapper.impl.UserDaoimpl;
import revelation.service.Userservice;

/**
 * @projectName: spring
 * @package: revelation.service.impl
 * @className: Userserviceimpl
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/14 11:56
 * @version: 1.0
 */
public class Userserviceimpl implements Userservice {
    private UserDao userDao = new UserDaoimpl();
    public void deleteservice() {
        userDao.deleteBYid();
    }
}
