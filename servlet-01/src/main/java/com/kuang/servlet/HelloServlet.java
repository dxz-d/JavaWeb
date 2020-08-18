package com.kuang.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @description  第一个servlet程序
 * 创建一个servlet的继承关系
 * @author diaoxiuze
 * @date 2020/8/18 18:18
 */
public class HelloServlet extends HttpServlet {


    /**
     * @description  由于get或post只是请求实现的不同方式，可以相互调用，业务逻辑都一样
     * @author diaoxiuze
     * @date 2020/8/18 18:32
     //* @param [req, resp]
     * @return void
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("第一个Servlet的doGet请求，Hello World 01");
        // 相应流
        PrintWriter writer = resp.getWriter();
        writer.println("HelloWorld");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
}
