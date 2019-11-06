package com.nice.validator.impl;

import com.nice.pojo.User;
import com.nice.validator.UserValidator;

public class UserValidatorImpl implements UserValidator {
    @Override
    public boolean validate(User user) {
        System.out.println("引入新的接口:" + UserValidator.class.getSimpleName());
        return user != null;
    }
}
