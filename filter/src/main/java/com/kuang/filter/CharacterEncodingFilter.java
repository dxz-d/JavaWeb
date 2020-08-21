package com.kuang.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @description  过滤字符集编码
 * @author diaoxiuze
 * @date 2020/8/21 19:06
 */
public class CharacterEncodingFilter implements Filter {
    /**
     * 初始化，web服务器启动，就以及初始化，随机等待过滤对象出现
     * @param filterConfig
     * @throws ServletException
     */
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("CharacterEncodingFilter初始化....");
    }

    /**
     * Chain：链
     *
     * 1.过滤中的所有代码，在过滤特定请求的时候都会执行
     * 2.必须要让过滤器继续同行
     * chain.doFilter(request,respose);
     *
     * @param request
     * @param response
     * @param chain
     * @throws IOException
     * @throws ServletException
     */
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=UTF-8");

        System.out.println("CharacterEncodingFilter执行前....");
        // 让我们的请求继续走，如果不写，程序到这里就被拦截停止
        chain.doFilter(request, response);
        System.out.println("CharacterEncodingFilter执行后....");
    }

    /**
     * 销毁：web服务器关闭的时候，过滤会销毁
     */
    public void destroy() {
        System.out.println("CharacterEncodingFilter销毁....");
    }
}
