<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Item</title>
    <link type="text/css" rel="stylesheet" href="/css/bootstrap.min.css">
</head>
<body>
<%@include file="navbar.jsp"%>

<div class="container">

    <form action="/additem" method="post">
        <div class="mb-3">
            <label class="form-label">Name</label>
            <input type="text" class="form-control" name="name">
        </div>

        <div class="mb-3">
            <label class="form-label">Price</label>
            <input type="text" class="form-control" name="price">
        </div>

        <div class="mb-3">
            <label class="form-label">Description</label>
            <textarea type="text" class="form-control" name="description"></textarea>
        </div>


        <div class="mb-3">
            <button class="btn btn-success">Add item</button>
        </div>

    </form>

<script type="text/javascript" src="/js/bootstrap.bundle.min.js"></script>
</body>
</html>
