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
    <title>jsptag</title>
</head>
<body>
    <%--jsp:include  包含  --%>
    <%--jsp:forward  转发  --%>
    <jsp:forward page="jsptag01.jsp">
        <jsp:param name="name" value="kuanshen"/>
        <jsp:param name="password" value="123"/>
    </jsp:forward>
</body>
</html>
