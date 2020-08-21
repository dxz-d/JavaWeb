package com.kuang.servlet;

import com.kuang.poji.Person;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * @description 得到Session，往里存数据
 * @author diaoxiuze
 * @date 2020/8/21 9:20
 */
public class SessionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 解决乱码问题
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        // 得到Session
        HttpSession session = req.getSession();

        // 给Session中存东西
        session.setAttribute("name", new Person("秦疆", 23));

        // 获取Session的ID
        String sessionId = session.getId();

        // 判断Session是不是新创建
        if (session.isNew()) {
            resp.getWriter().write("Session创建成功，ID：" +sessionId);
        } else {
            resp.getWriter().write("Session已经存在服务器了，ID：" +sessionId);
        }

        // Session创建的时候做了什么事情
        Cookie cookie = new Cookie("JSESSIONID", sessionId);
        resp.addCookie(cookie);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
}
