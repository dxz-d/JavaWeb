<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 12057
  Date: 2020/8/21
  Time: 17:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>corewhen</title>
</head>
<body>
    <!--定义一个变量score，值为85-->
    <c:set var="score" value="82"/>

    <c:choose>
        <c:when test="${score>=90}">
            优秀
        </c:when>
        <c:when test="${score>=80}">
            好
        </c:when>
        <c:when test="${score>=70}">
            良
        </c:when>
        <c:when test="${score>=60}">
            很棒
        </c:when>
    </c:choose>
</body>
</html>
