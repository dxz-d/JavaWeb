<%--
  Created by IntelliJ IDEA.
  User: 12057
  Date: 2020/8/21
  Time: 15:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>pageContextDemo01</title>
</head>
<body>

    <%
        String name1 = (String) pageContext.getAttribute("name1");
        /*String name2 = (String) request.getAttribute("name2");
        String name3 = (String) session.getAttribute("name3");*/
        String name2 = (String) pageContext.getAttribute("name2");
        String name3 = (String) pageContext.getAttribute("name3");
        String name4 = (String) pageContext.getAttribute("name4");
        String name5 = (String) pageContext.getAttribute("name5");
    %>


    <%--使用el表达式输出  ${} --%>
    <h1>取出的值为：</h1>
    <h3>${name1}</h3>
    <h3>${name2}</h3>
    <h3>${name3}</h3>
    <h3>${name4}</h3>
    <h3>${name5}</h3>

    <h3><%=name5%></h3>

</body>
</html>
