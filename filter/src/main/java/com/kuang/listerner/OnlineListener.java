package com.kuang.listerner;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @description  统计网站在线人数 统计session
 * @author diaoxiuze
 * @date 2020/8/22 15:25
 */
public class OnlineListener implements HttpSessionListener {

    /**
     * 创建session监听：看你的一举一动
     * 一旦创建session，就会傅发一次这个事件
      * @param event
     */
    public void sessionCreated(HttpSessionEvent event) {
        ServletContext servletContext = event.getSession().getServletContext();

        System.out.println(event.getSession().getId());

        Integer onlineCount = (Integer) servletContext.getAttribute("OnlineCount");

        if (onlineCount == null) {
            onlineCount  = new Integer(1);
        } else {
            int count = onlineCount.intValue();
            onlineCount = new Integer(count + 1);
        }

        servletContext.setAttribute("OnlineCount", onlineCount);
    }

    /**
     * 销毁session监听
     * 一旦销毁session就会触发一次这个事件
     * @param event
     */
    public void sessionDestoryed(HttpSessionEvent event) {
        ServletContext servletContext = event.getSession().getServletContext();

        Integer onlineCount = (Integer) servletContext.getAttribute("OnlineCount");

        if (onlineCount == null) {
            onlineCount = new Integer(0);
        } else {
            int count = onlineCount.intValue();
            onlineCount = new Integer(count - 1);
        }

        servletContext.setAttribute("OnlineCount", onlineCount);
    }

}
