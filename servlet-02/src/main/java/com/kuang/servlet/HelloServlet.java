package com.kuang.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @description  多个Servlet共享ServletContext
 * @author diaoxiuze
 * @date 2020/8/19 14:46
 */
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 初始化配置
        // this.getInitParameter();
        // Servlet配置
        // this.getServletConfig();
        // Servlet上下文
        // this.getServletContext();

        System.out.println("进入HelloServlet！！");

        ServletContext servletContext = this.getServletContext();
        String userName = "秦疆";
        // 将一个数据保存在了ServletContext中，名字为username，值：username
        servletContext.setAttribute("userName",userName);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
}
