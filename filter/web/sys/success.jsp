<%@ page import="com.kuang.util.Constant" %><%--
  Created by IntelliJ IDEA.
  User: 12057
  Date: 2020/8/24
  Time: 9:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>success</title>
</head>
<body>

    <%--<%
        Object userSession = request.getSession().getAttribute(Constant.USER_SESSION);
        if (userSession == null) {
            response.sendRedirect("/filter/error.jsp");
        }
    %>--%>

    登录成功！

    <a href="${pageContext.request.contextPath}/servlet/logout">注销</a>
</body>
</html>
