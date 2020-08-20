<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>index</title>
</head>
<body>
    <form method="post" action="${pageContext.request.contextPath}/login">
        用户名：<input type="text" name="username"><br>
        密 码：<input type="password" name="password"><br>
        爱好：
        <input type="checkbox" name="hobbies" value="抽烟">抽烟111
        <input type="checkbox" name="hobbies" value="喝酒">喝酒
        <input type="checkbox" name="hobbies" value="烫头">烫头
        <input type="checkbox" name="hobbies" value="唱跳">唱跳
        <br>
        <input type="submit">
    </form>
</body>
</html>