package annotation.mapper.impl;

import annotation.mapper.userDao;
import org.springframework.stereotype.Repository;

/**
 * @projectName: spring
 * @package: annotation.mapper.impl
 * @className: userDaoimpl
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/21 8:50
 * @version: 1.0
 */
@Repository
public class userDaoimpl implements userDao {
    @Override
    public void insert() {
        System.out.println("insert");
    }
}
