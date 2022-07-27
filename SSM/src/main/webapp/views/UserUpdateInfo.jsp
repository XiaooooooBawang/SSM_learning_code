<%@ page import="com.item.model.Users" %><%--
  Created by IntelliJ IDEA.
  User: 小霸王
  Date: 2022/7/21
  Time: 9:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改密码</title>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
<% Users users=(Users)request.getAttribute("users");%>
<form action="/UserUpdateInfoApi" method="post">
    <p>
        编号：<input type="text" name="id" value="<%=users.getId()%>" readonly/>
    </p>
    <p>
        用户名：<%=users.getUserName()%>
    </p>
    <p>
        <input type="password" name="pwd" value="<%=users.getPwd()%>" placeholder="请输入用户密码" class="form form-control"/>
    </p>
    <p>
        昵称：<%=users.getNickName()%>
    </p>
    <p>
        <input type="submit" value="修改数据" class="btn btn-primary btn-block"/>
    </p>
</form>
</body>
</html>
