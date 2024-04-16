<%--
  Created by IntelliJ IDEA.
  User: 丁海斌
  Date: 2023/7/26
  Time: 10:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>使用servlet+mybatis+springioc完成登录功能</h2>
<form method="post" action="http://localhost:8080/webtest/login">
    账号：<input type="text" name="username"><br>
    密码：<input type="password" name="password"><br>
    <input type="submit" value="登录"><input type="reset" value="清空">
</form>
</body>
</html>
