package com.kuang.dao.user;

import com.kuang.pojo.User;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @description
 * @author diaoxiuze
 * @date 2020/8/24 18:10
 */
public interface UserDao {

    /**
     * 得到要登录的用户
     * @param connection
     * @param userCode
     * @return
     */
    public User getLoginUser(Connection connection, String userCode) throws SQLException;
}
