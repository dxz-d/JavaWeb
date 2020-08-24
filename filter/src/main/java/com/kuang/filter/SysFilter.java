package com.kuang.filter;


import com.kuang.util.Constant;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @description
 * @author diaoxiuze
 * @date 2020/8/24 10:15
 */
public class SysFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
        // ServletRequest    HttpServletRequest
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;


        Object userSession = request.getSession().getAttribute(Constant.USER_SESSION);
        if (userSession == null) {
            response.sendRedirect("/filter/error.jsp");
        } else {
            response.sendRedirect("/filter/error.jsp");
        }

        chain.doFilter(request, response);
    }

    public void destroy() {

    }
}
