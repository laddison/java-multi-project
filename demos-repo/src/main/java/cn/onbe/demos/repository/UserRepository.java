package cn.onbe.demos.repository;

import cn.onbe.demos.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * security repository
 * @author LiQiuShui
 */
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    /**
     * 根据用户名查找用户
     * @param username 用户名称
     * @return UserEntity
     */
    UserEntity findByUsername(String username);
}
