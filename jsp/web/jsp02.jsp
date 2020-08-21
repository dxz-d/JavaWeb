<%--
  Created by IntelliJ IDEA.
  User: 12057
  Date: 2020/8/21
  Time: 14:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <%--@include会将两个页面合二为一--%>
    <%@include file="common/header.jsp"%>
    
    <h1>网页主体</h1>
    <%
        int i = 10;
    %>
    <%@include file="common/footer.jsp"%>

    <hr>

    <%--jsp标签
        jsp：include：拼接页面，本质还是三个
    --%>
    <%--<jsp:include page="common/header.jsp"/>
    <h2>网页中间</h2>


    <jsp:include page="common/footer.jsp"/>--%>
</body>
</html>
