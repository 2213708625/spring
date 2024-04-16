package Annotation.mapper;

import Annotation.bean.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @projectName: spring
 * @package: Annotation.mapper
 * @className: UserMapper
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/30 15:15
 * @version: 1.0
 */
@Repository
public interface UserMapper {
    int insert(User user);
    int deleteByusername(String username);
    int updateByusername(User user);
    User selectByusername(String username);
    List<User> selectAll();
}
