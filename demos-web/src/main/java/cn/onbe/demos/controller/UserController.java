package cn.onbe.demos.controller;

import cn.onbe.demos.entity.UserEntity;
import cn.onbe.demos.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户控制器
 * @author LiQiuShui
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("list")
    public String list() {
        List<UserEntity> list = userService.list();

        for (UserEntity user : list) {
            System.out.println(user.getMobile());
        }

        return "";
    }
}
