
<%--
  Created by IntelliJ IDEA.
  User: 12057
  Date: 2020/8/21
Time: 16:21
To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core_1_1" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h4>if测试1</h4>

    <form action="coreif.jsp" method="get">
        <%--
            el表达式获取表单中的数据
            ${param.参数名}
        --%>
        <input type="text" name="username" value="${param.username}">
        <input type="submit" value="登录">
    </form>

    <%--判断如果提交的用户名是管理员，则登录成功--%>
    <c:if test="${param.username=='admin'}" var="isAdmin">
        <c:out value="管理员欢迎您！"/>
    </c:if>

    <%--自闭合标签--%>
    <c:out value="${isAdmin}"/>
</body>
</html>




























