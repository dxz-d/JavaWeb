package com.kuang.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @description
 * @author diaoxiuze
 * @date 2020/8/24 17:27n
 */
public class CharcterEncodingFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");

        chain.doFilter(request, response);
    }

    public void destroy() {

    }
}
