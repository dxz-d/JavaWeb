<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>index</title>
    <script src="http://libs.baidu.com/jquery/2.1.4/jquery.min.js"></script>
</head>
<body>
    <!--<form method="get" action="${pageContext.request.contextPath}/request">请求项目路径-->
    <!--http://localhost:8080/response/request-->
    <form method="get" action="${pageContext.request.contextPath}/request">
        用户名：<input type="text" name="username"><br>
        密 码：<input type="password" name="password"><br>
        <input type="submit">
    </form>
</body>
</html>