package com.kuang.test;

import java.sql.*;

/**
 * @description
 * @author diaoxiuze
 * @date 2020/8/24 12:01
 */
public class JdbcTest02 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 配置信息
        String url = "jdbc:mysql://localhost:3306/db_student?useSSL=false&useUnicode=true&characterEncoding=UTF-8&serverTimezone=GMT%2B8";
        String username = "root";
        String password = "123456";

        // 1.加载驱动
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 2.连接数据库
        Connection connection = DriverManager.getConnection(url, username, password);

        // 3.编写sql
        String sql = "insert into t_student (sid,name,sex,age) VALUES (?, ?, ?, ?);";

        // 4.预编译
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        // 给占位符？
        preparedStatement.setString(1, "2");
        preparedStatement.setString(2, "狂神");
        preparedStatement.setString(3, "男");
        preparedStatement.setInt(4,24);

        // 5.执行sql
        int i = preparedStatement.executeUpdate();
        if (i>0) {
            System.out.println("插入成功");
        }

        // 6.关闭连接，释放资源   先开后关
        preparedStatement.close();
        connection.close();
    }
}
