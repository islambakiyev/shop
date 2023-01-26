<%@ page import="java.util.ArrayList" %>
<%@ page import="kz.bitlab.javaee.db.Item" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home Page</title>
    <link type="text/css" rel="stylesheet" href="/css/bootstrap.min.css">
</head>
<body>
<%@include file="navbar.jsp"%>

<div class="container">
    <p class="h1 mt-5 text-center">WELCOME TO BITLAB SHOP</p>
    <p class="lead text-center">
       Electronic devices with high quality and service.
    </p>

<div class="row">

    <%
        ArrayList<Item> items = (ArrayList<Item>) request.getAttribute("items");
        for(Item item : items){
    %>
    <div class="col-md-4 mt-5">
        <div class="card" style="width: 18rem;">
            <div class="card-body">
                <h5 class="card-title"><%=item.getName()%></h5>
                <p class="card-text"><%=item.getPrice()%></p>
                <p class="card-text"><%=item.getDescription()%></p>
                <a href="#" class="btn btn-success">Buy now</a>
            </div>
        </div>
    </div>
    <%
        }
    %>



</div>

</div>

<script type="text/javascript" src="/js/bootstrap.bundle.min.js"></script>
</body>
</html>
