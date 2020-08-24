package com.kuang.service.user;

import com.kuang.dao.BaseDao;
import com.kuang.dao.user.UserDao;
import com.kuang.dao.user.UserDaoImpl;
import com.kuang.pojo.User;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @description
 * @author diaoxiuze
 * @date 2020/8/24 18:08
 */
public class UserServiceImpl implements UserService{

    /**
     * 业务层调用dao层，所以我们要引入dao层
      */
    private UserDao userDao;

    public UserServiceImpl() {
        userDao = new UserDaoImpl();
    }

    public User login(String userCode, String password) {
        Connection connection = null;
        User user = null;

        try {
            connection = BaseDao.getConnection();
            // 通过业务层调用对应的具体的数据库操作
            user = userDao.getLoginUser(connection, userCode);
        } catch (SQLException e) {
            e.printStackTrace();
            BaseDao.closeResource(connection, null, null);
        }
        return user;
    }


}

































