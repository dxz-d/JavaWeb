<%--
  Created by IntelliJ IDEA.
  User: 12057
  Date: 2020/8/21
  Time: 15:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>pageContext页面</title>
</head>
<body>

    <%--内置对象--%>
    <%
        // 客户端向服务器发送请求,保存的数据只在当前页面中有效
        pageContext.setAttribute("name1", "秦疆1号");
        // 客户端向服务器发送请求,保存的数据在一次请求中有效，请求转发会携带这个数据,比如新闻
        request.setAttribute("name2", "秦疆2号");
        // 客户端向服务器发送请求,保存的数据只在一次会话中有效，开始到打开浏览器到关闭浏览器，比如购物车
        session.setAttribute("name3", "秦疆3号");
        // 客户端向服务器发送请求,保存的数据只在服务器中有效，从打开服务器到关闭服务器，比如聊天记录
        application.setAttribute("name4", "秦疆4号");
    %>


    <%--脚本片段中的代码，会原封不动生成到.jsp.java
        要求：这里面的代码，必须保证java语法的正确性
    --%>
    <%
        String name1 = (String) pageContext.getAttribute("name1");
        /*String name2 = (String) request.getAttribute("name2");
        String name3 = (String) session.getAttribute("name3");*/
        String name2 = (String) pageContext.getAttribute("name2");
        String name3 = (String) pageContext.getAttribute("name3");
        String name4 = (String) pageContext.getAttribute("name4");
        String name5 = (String) pageContext.getAttribute("name5");


        //request.getRequestDispatcher("/index.jsp").forward(request,response);等价于
        pageContext.forward("/pageContextDemo01.jsp");


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
























