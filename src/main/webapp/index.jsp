<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><%= "some title" %></title>
    <style>
        body {
            background: url(http://media.istockphoto.com/photos/abstract-background-in-shades-of-light-blue-picture-id472586846?k=6&m=472586846&s=170667a&w=0&h=N2xOiqX8ISlT0RnaUL5fd96r1j7MbEK8hxzwzxLBVTc=) no-repeat;
            background-size: cover;
        }
    </style>
</head>
<body>
<%@ include file="partials/navbar.jsp" %>
    <c:if test="true">
        <h1>Variable names should be very descriptive</h1>
    </c:if>
    <c:if test="false">
        <h1>single letter variable names are good</h1>
    </c:if>
</body>
</html>
