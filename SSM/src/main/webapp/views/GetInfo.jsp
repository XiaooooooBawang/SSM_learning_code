<%@ page import="com.item.model.Users" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: 小霸王
  Date: 2022/7/20
  Time: 14:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>显示页面·Get请求</title>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
<form action="/GetName" method="get">
    <input type="text" placeholder="输入昵称查询" name="nickName"/>
    <input type="submit" value="提交" class="btn btn-primary"/>
</form>
<% List<Users> lists = (List<Users>) request.getAttribute("lists");%>
<table class="table table-bordered table-hover table-striped">
    <tr class="info">
        <th>编号</th>
        <th>账号</th>
        <th>密码</th>
        <th>昵称</th>
        <th>操作</th>
    </tr>
    <%
        for (Users u : lists) {
    %>
    <tr>
        <td><%=u.getId()%></td>
        <td><%=u.getUserName()%></td>
        <td><%=u.getPwd()%></td>
        <td><%=u.getNickName()%></td>
        <td>
            <a href="/UserUpdateInfo?id=<%=u.getId()%>" class="btn btn-primary">修改</a>
            <a href="/UsersDeleteById?id=<%=u.getId()%>"
               onclick="return confirm('是否删除此行?')"
               class="btn btn-primary">删除</a>
        </td>
    </tr>
    <%
        }
    %>
    <tr>
        <td colspan="10">
            <a href="/UserAddInfo" class="btn btn-block btn-primary">添加</a>
        </td>
    </tr>
</table>
</body>
</html>