package cn.onbe.demos.service;

import cn.onbe.demos.entity.UserEntity;
import cn.onbe.demos.entity.dto.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * UserDetailsService 实现类，保存用户数据
 * @author LiQiuShui
 */
public interface JwtUserDetailsService extends UserDetailsService {
    /**
     * 保存注册用户
     * @param userDto 用户
     * @return userEntity
     */
    UserEntity save(UserDto userDto);
}
