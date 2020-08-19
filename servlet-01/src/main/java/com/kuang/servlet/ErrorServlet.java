package com.kuang.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/***
 * @description  找不到页面进去ErrorServlet  ————》 404
 * @author diaoxiuze
 * @date 2020/8/19 10:17
 */
public class ErrorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 设置浏览器默认打开的时候采用的字符集
        System.out.println("进入ErrorServlet的doGet");
        resp.setHeader("Content-type","text/html;charset=UTF-8");
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println("进入ErrorServlet，404！");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
}
