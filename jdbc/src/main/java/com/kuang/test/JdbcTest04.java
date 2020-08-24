package com.kuang.test;

import java.sql.*;

/**
 * @description  简单事务处理
 * @author diaoxiuze
 * @date 2020/8/24 14:26
 */
public class JdbcTest04 {
    public static void main(String[] args) {
        // 配置信息
        String url = "jdbc:mysql://localhost:3306/db_student?useSSL=false&useUnicode=true&characterEncoding=UTF-8&serverTimezone=GMT%2B8";
        String username = "root";
        String password = "123456";

        Connection connection = null;

        try {
            // 1.加载驱动
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2.连接数据库
            connection = DriverManager.getConnection(url, username, password);

            // 3.通知数据库开启事务，false  开启
            connection.setAutoCommit(false);

            String sql01 = "update account set money = money -100 where name = 'A'";
            connection.prepareStatement(sql01).executeUpdate();

            String sql02 = "update account set money = money +100 where name = 'B'";
            connection.prepareStatement(sql02).executeUpdate();

            // 以上两条sql都执行成功了，就提交事务
            connection.commit();
            System.out.println("success！！！");
        } catch (Exception e) {
            // 如果出现异常，就通知数据库回滚事务
            try {
                connection.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}
