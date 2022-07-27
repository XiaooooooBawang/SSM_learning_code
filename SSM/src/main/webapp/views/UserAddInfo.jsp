<%--
  Created by IntelliJ IDEA.
  User: 小霸王
  Date: 2022/7/21
  Time: 9:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加信息</title>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
<form action="/UserAddInfoApi" method="post">
    <p>
        <input type="text" name="userName" placeholder="请输入用户名" class="form form-control"/>
    </p>
    <p>
        <input type="password" name="pwd" placeholder="请输入用户密码" class="form form-control"/>
    </p>
    <p>
        <input type="text" name="nickName" placeholder="请输入用户昵称" class="form form-control"/>
    </p>
    <p>
        <input type="submit" value="添加数据" class="btn btn-primary btn-block"/>
    </p>
</form>
</body>
</html>