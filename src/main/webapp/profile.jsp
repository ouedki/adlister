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

<h1>Welcome to your profile <%= request.getAttribute("username") %> </h1>

</body>
</html>
