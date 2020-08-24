package com.kuang.service.user;

import com.kuang.pojo.User;

import java.sql.SQLException;

/**
 * @description
 * @author diaoxiuze
 * @date 2020/8/24 18:08
 */
public interface UserService {

    /**
     * 用户登录
     */
    public User login(String userCode, String password) throws SQLException;
}
