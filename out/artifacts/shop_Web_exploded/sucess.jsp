<%@ page import="kz.bitlab.javaee.db.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home Page</title>
    <link type="text/css" rel="stylesheet" href="/css/bootstrap.min.css">
</head>
<body>
<%@include file="navbar.jsp"%>

<%--<%--%>
<%--    User user = (User)request.getAttribute("user");--%>
<%--%>--%>
<div class="container">
    <p class="h1 mt-5 text-center">Hello, user!</p>
    <p class="lead text-center">
        This is your profile
    </p>

</div>

<script type="text/javascript" src="/js/bootstrap.bundle.min.js"></script>
</body>
</html>
