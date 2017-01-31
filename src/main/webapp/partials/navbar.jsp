<%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 1/30/17
  Time: 4:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
    <style>

        div#menubar {
            border: 2px hsla(64, 77%, 6%, 0.58) solid;
            padding: 25px;
        }
        div#menubar>a {
            font-size: 15px;
            padding: 15px 30px;
            background-color: hsla(0, 34%, 19%, 0.42);;
            color: #000;
            margin-right: 10px;
            text-decoration: none;
            border-radius: 5px;
            transition: background-color 0.5s linear 0s, color 0.5s linear 0s;
        }
        div#menubar> a:hover {
            background-color: hsla(64, 77%, 6%, 0.58);;
            color:#FFF;
        }
    </style>
</head>
<body>
<div id="menubar">
    <a href="/">Home</a>
    <a href="#">About</a>
    <a href="/profile">Profile</a>
    <a href="/login">Login</a>
</div>

</body>
</html>
