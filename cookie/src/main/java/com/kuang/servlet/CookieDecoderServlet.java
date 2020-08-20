package com.kuang.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Date;

/**
 * @description  编码解码
 * @author diaoxiuze
 * @date 2020/8/20 17:06
 */
public class CookieDecoderServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


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
        if (cookie.getName().equals("name")) {
        // 获取cookie中的名字
        System.out.println(cookie.getValue());
        // 解码
        writer.write(URLDecoder.decode(cookie.getValue(), "utf-8"));
        }
        }
        } else {
        writer.write("这是您第一次访问本站！");
        }

        // 编码
        Cookie cookie = new Cookie("name", URLEncoder.encode("秦疆", "utf-8"));

        resp.addCookie(cookie);

        }

@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        }
        }
