package com.kuang.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @description  文件下载
 * @author diaoxiuze
 * @date 2020/8/19 18:24
 */
public class FileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1.要获取下载文件的路径
        //D:\java\JavaWeb\response\src\main\resources\psb.png
        //:\Users\12057\Pictures\car\1.jfif
        String filePath = "D:\\java\\JavaWeb\\response\\src\\main\\resources\\psb.png";
        System.out.println("要获取下载文件的路径:" + filePath);
        // 2.下载的文件名是啥
        String fileName = filePath.substring(filePath.lastIndexOf("\\") + 1);
        // 3.设置想让浏览器支持（Content-Disposition）我们下载文件需要的东西
        // attachment后为:（冒号）进入down()方法可以直接查看
        // attachment后为;（引号）进入down()方法可以下载
        // resp.setHeader("Content-Disposition","attachment:filename=" +fileName);
        resp.setHeader("Content-Disposition","attachment;filename=" +fileName);
        // 4.获取下载文件的输入流
        FileInputStream fileInputStream = new FileInputStream(filePath);
        // 5.创建缓冲区
        int len = 0;
        byte[] buffer = new byte[1024];
        // 6.获取OutStream对象
        ServletOutputStream servletOutputStream = resp.getOutputStream();
        // 7.将FileOutStream流写入到buffer缓存区，使用OutputStream将缓冲区的数据输出到客户端
        while ((len=fileInputStream.read(buffer)) > 0 ) {
            servletOutputStream.write(buffer, 0 , len);
        }
        // 8.关闭流操作
        fileInputStream.close();
        servletOutputStream.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
}


















