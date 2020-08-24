package com.kuang.test;

import java.sql.*;

/**
 * @description
 * @author diaoxiuze
 * @date 2020/8/24 11:25
 */
class JdbcTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 配置信息
        String url = "jdbc:mysql://localhost:3306/db_student?useSSL=false&useUnicode=true&characterEncoding=UTF-8&serverTimezone=GMT%2B8";
        String username = "root";
        String password = "123456";

        // 1.加载驱动
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 2.连接数据库
        Connection connection = DriverManager.getConnection(url, username, password);

        // 3.向数据库发送SQL的对象Statement：CURD
        Statement statement = connection.createStatement();

        // 4.编写sql
        String sql = "select * from t_student";

        // 受影响的行数，增删改
        // int i = statement.executeUpdate(sql);

        // 5.执行查询sql，返回一个Result：结果集
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            System.out.println("sid=" +resultSet.getObject("sid"));
            System.out.println("name=" +resultSet.getObject("name"));
            System.out.println("sex=" +resultSet.getObject("sex"));
            System.out.println("age=" +resultSet.getObject("age"));
        }

        // 6.关闭连接，释放资源   先开后关
        resultSet.close();
        statement.close();
        connection.close();
    }
}
