package web.mapper;

import org.apache.ibatis.annotations.Param;
import web.bean.User;

/**
 * @projectName: spring
 * @package: web.mapper
 * @className: UserMapper
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/26 10:38
 * @version: 1.0
 */
public interface UserMapper {
    User select(@Param("username") String username, @Param("password") String password);
    int insert(User user);

}
