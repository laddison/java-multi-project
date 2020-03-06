package cn.onbe.demos.service.impl;

import cn.onbe.demos.entity.UserEntity;
import cn.onbe.demos.repository.UserRepository;
import cn.onbe.demos.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * 用户服务实现类
 * @author LiQiuShui
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserEntity> list() {
        List<UserEntity> list = userRepository.findAll();
        
        return list;
    }
}
