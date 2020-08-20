package com.kuang.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @description
 * @author diaoxiuze
 * @date 2020/8/20 16:43
 */
public class CookieDeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 创建一个cookie，名字必须要和删除的名字一致
        Cookie cookie = new Cookie("lastLoginTime", System.currentTimeMillis() + "");
        // 将cookie有效期设置为0，立马删除
        cookie.setMaxAge(0);
        resp.addCookie(cookie);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
}
