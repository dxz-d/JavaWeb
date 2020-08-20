package com.kuang.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * @description  Cookie在客户端
 * @author diaoxiuze
 * @date 2020/8/20 15:34
 */
public class CookieServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 服务器，告诉你，你来的时间，把这个时间封装成为一个信件；你下次来，服务器就知道你来了

        // 解决中文乱码
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setHeader("content-type", "text/html;charset=UTF-8");

        PrintWriter writer = resp.getWriter();

        // Cookie，服务器端从客户端获取  这里返回数组，说明Cookie可能存在多个
        Cookie[] cookies = req.getCookies();

        // 判断Cookie是否存在
        if (cookies != null) {
            // 如果存在怎么办
            writer.write("你上次访问的时间是：");

            for (int i = 0; i < cookies.length; i++) {
                Cookie cookie = cookies[i];
                // 获取cookie的名字
                if (cookie.getName().equals("lastLoginTime")) {
                    // 获取cookie中的值
                    long lastLoginTime = Long.parseLong(cookie.getValue());
                    Date date = new Date(lastLoginTime);
                    writer.write(date.toLocaleString());
                }
            }
        } else {
            writer.write("这是您第一次访问本站！");
        }

        //服务给客户端响应一个cookie
        Cookie cookie = new Cookie("lastLoginTime", System.currentTimeMillis() + "");

        //cookie有效期为1天
        cookie.setMaxAge(24*60*60);

        resp.addCookie(cookie);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
}
