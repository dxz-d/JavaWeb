<%--
  Created by IntelliJ IDEA.
  User: 12057
  Date: 2020/8/21
  Time: 13:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%--jsp表达式
    作用：用来将程序的输出，输出到客户端
    --%>

    <%= new java.util.Date()%>

    <%--jsp脚本片段--%>
    <%
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum+=i;
        }
        out.println("<h1>"+sum+"</h1>");
    %>

    <%
        int x = 10;
        out.println("x:"+ x);
    %>
    <p>这是一个jsp文档</p>
    <%
        int y = 2;
        out.println("y:"+ y);
    %>


    <%--在代码中嵌入html元素--%>
    <%
        for (int i = 0; i < 5; i++) {
    %>
        <h1>hello,World <%=i%></h1>
    <%
        }
    %>


    <%--jsp声明--%>
    <%!
        static {
            System.out.println("Loading Servlet!");
        }

        private int globalVar = 0;

        public void kuang() {
            System.out.println("进入方法kuang()");
        }
    %>
</body>
</html>

























