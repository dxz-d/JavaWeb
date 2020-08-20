package com.kuang.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

/**
 * @description  Request应用
 * @author diaoxiuze
 * @date 2020/8/20 14:34
 */
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // 请求相应的字符集
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        // 获取前端页面的值
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String[] hobbies = req.getParameterValues("hobbies");

        System.out.println(username+"————》"+password+"————》"+ Arrays.toString(hobbies));
        req.getRequestDispatcher("success.html").forward(req, resp);
    }
}
