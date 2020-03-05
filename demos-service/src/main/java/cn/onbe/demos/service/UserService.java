package cn.onbe.demos.service;

import cn.onbe.demos.entity.UserEntity;

import java.util.List;

/**
 * 用户服务
 * @author LiQiuShui
 */
public interface UserService {
     /**
      * 用户列表
      * @return List 用户列表
      */
     List<UserEntity> list();
}
