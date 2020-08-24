<%--
  Created by IntelliJ IDEA.
  User: 12057
  Date: 2020/8/24
  Time: 9:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
    <h3>登录</h3>
    <form method="get" action="${pageContext.request.contextPath}/servlet/login">
        用户名：<input type="text" name="username"><br>
              <input type="submit">
    </form>
</body>
</html>
