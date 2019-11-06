package com.nice.service.impl;

import com.nice.pojo.User;
import com.nice.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author ningh
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public void printUser(User user) {
        if (user == null) {
            throw new RuntimeException("检查用户参数是否为空......");
        }
        System.out.println("id = " + user.getUserId());
        System.out.println("username = " + user.getUsername());
        System.out.println("note = " + user.getNote());
    }

    @Override
    public void manyAspects() {
        System.out.println("测试多个切面顺序");
    }
}
