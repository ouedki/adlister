<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 1/31/17
  Time: 2:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <jsp:include page="/partials/head.jsp">
        <jsp:param name="title" value="Welcome to my site!" />
    </jsp:include>
</head>
<body>
<jsp:include page="/partials/navbar.jsp" />
<h1 style="color: blue">List of Items</h1>
<table class="table table-inverse">
    <tr>
        <th>ID #</th>
        <th>Title</th>
        <th>Description</th>
    </tr>
<c:forEach var="ad" items="${ads}">
    <tr>
        <td>${ad.id}</td>
        <td>${ad.title}</td>
        <td>${ad.description}</td>
    </tr>
</c:forEach>
</table>
</body>
</html>
