<%--
  Created by IntelliJ IDEA.
  User: 12057
  Date: 2020/8/21
  Time: 15:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>pageContextDemo02</title>
</head>
<body>

<%
    //request.getRequestDispatcher("/index.jsp").forward(request,response);等价于
    pageContext.forward("/index.jsp");

%>
</body>
</html>
