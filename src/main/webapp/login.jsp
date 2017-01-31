<%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 1/30/17
  Time: 4:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@ include file="partials/navbar.jsp" %>

<form action="/profile.jsp" method="POST">
    <label for="username">User Name:</label>
    <input name="username" id="username">

    <label for="pw">Password: </label>
    <input name="pw" id="pw" type="password">

    <button type="submit">Login</button>
</form>

</body>
</html>
