package com.nice.controller;

import com.nice.pojo.User;
import com.nice.service.UserService;
import com.nice.validator.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ningh
 */
@RestController
@RequestMapping("/user")
public class UserController {

    /**
     * 注入用户服务
     */
    @Autowired
    private UserService userService;

    @RequestMapping("/print")
//    @ResponseBody
    public User printUser(Long id,String userName,String note) {
        User user = new User();
        user.setUserId(id);
        user.setUsername(userName);
        user.setNote(note);
        userService.printUser(user);
        return user;
    }

    /**
     * 测试引入的验证器
     * @param id    用户id
     * @param userName  用户名
     * @param note  用户信息
     * @return 用户实体类
     */
    @RequestMapping("/vp")
    public User validateAndPrint(Long id,String userName,String note) {
        User user = new User();
        user.setUserId(id);
        user.setUsername(userName);
        user.setNote(note);
        //强制转换
        UserValidator userValidator = (UserValidator) userService;
        if (userValidator.validate(user)) {
            userService.printUser(user);
        }
        return user;
    }

    @RequestMapping("/manyAspects")
    public String manyAspects() {
        userService.manyAspects();
        return "manyAspects";
    }
}
