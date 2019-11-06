package com.nice.validator;

import com.nice.pojo.User;

/**
 * 用户检测借口
 * @author ningh
 */
public interface UserValidator {
    /**
     * 检测用户对象是否为空
     * @param user  用户对象
     * @return true or false
     */
    public boolean validate(User user);
}
