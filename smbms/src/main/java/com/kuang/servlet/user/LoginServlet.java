package com.kuang.servlet.user;

import com.kuang.pojo.User;
import com.kuang.service.user.UserService;
import com.kuang.service.user.UserServiceImpl;
import com.kuang.util.Constants;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * @description
 * @author diaoxiuze
 * @date 2020/8/24 18:00
 */
public class LoginServlet extends HttpServlet {

    // Servlet：控制层，调用业务层代码

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("LoginServlet--start....");

        // 获取登录名和密码
        String userCode = req.getParameter("userCode");
        String userPassword = req.getParameter("userPassword");

        // 和数据库中的密码进行对比，调用业务层
        UserService userService = new UserServiceImpl();
        try {
            // 这里已经把登录的人给查出来了
            User user = userService.login(userCode, userPassword);
            if (user!=null) {
                // 将用户的信息放到Session中；
                req.getSession().setAttribute(Constants.USER_SESSION, user);
                // 跳转到主页
                resp.sendRedirect("/smbms/jsp/frame.jsp");
                // 查无此人，无法登录
            } else {
                // 转发回登录页面，顺带提示它，用户名或密码错误
                req.setAttribute("error", "用户名错误");
                req.getRequestDispatcher("/login.jsp").forward(req, resp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


        // 数据库有这个登录名，可以登录
    }
}

































