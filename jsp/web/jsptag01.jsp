<%--
  Created by IntelliJ IDEA.
  User: 12057
  Date: 2020/8/21
  Time: 15:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    22

    <hr>
    姓名：<%="name"%>
    密码：<%="password"%>

    <hr>
    姓名1：<%=request.getParameter("name")%>
    密码1：<%=request.getParameter("password")%>
</body>
</html>
