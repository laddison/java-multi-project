package cn.onbe.demos.repository;

import cn.onbe.demos.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * UserRepository
 * @author LiQiuShui
 */
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
}
