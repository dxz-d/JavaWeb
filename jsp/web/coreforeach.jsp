
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: 12057
  Date: 2020/8/21
  Time: 17:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>foreach</title>
</head>
<body>

    <%
        ArrayList<Object> people = new ArrayList<>();
        people.add(0, "张三");
        people.add(1, "李四");
        people.add(2, "王五");
        people.add(3, "赵六");
        people.add(4, "田六");
        request.setAttribute("list", people);
    %>

    <c:forEach var="people" items="${list}">
        <c:out value="${people}"/>
    </c:forEach>
</body>
</html>
