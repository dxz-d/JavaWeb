package com.kuang.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @description  读取properties配置文件
 * @author diaoxiuze
 * @date 2020/8/19 16:41
 */
public class WritePropServlet extends HelloServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 读取resource目录下的db.properties
        InputStream inputStream = this.getServletContext().getResourceAsStream("/WEB-INF/classes/db.properties");
        // 读取com/kuang/servlet包下的db.properties
        InputStream inputStreamd = this.getServletContext().getResourceAsStream("/WEB-INF/classes/com/kuang/servlet/db.properties");
        Properties properties = new Properties();
        properties.load(inputStream);
        properties.load(inputStreamd);
        String user = properties.getProperty("username");
        String pwd = properties.getProperty("password");
        String user1 = properties.getProperty("username1");
        String pwd1 = properties.getProperty("password1");
        resp.getWriter().println(user+":"+pwd);
        resp.getWriter().println(user1+":"+pwd1);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
}
