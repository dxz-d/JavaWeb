package com.kuang.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @description  请求转发的Servlet dispacher forward
 * @author diaoxiuze
 * @date 2020/8/19 16:00
 */
public class DispacherServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("进入DispacherServlet！");
        ServletContext servletContext = this.getServletContext();
        // getRequestDispatcher()   请求的转发路径
        // forward()        调用forward实现请求转发
        servletContext.getRequestDispatcher("/getInit").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
}
