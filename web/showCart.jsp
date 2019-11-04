<%--
  Created by IntelliJ IDEA.
  User: Anuarbek
  Date: 04.11.2019
  Time: 10:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show some.Cart</title>
</head>
<body>
    <%@ page import="some.Cart" %>

    <% Cart cart = (Cart)session.getAttribute("cart"); %>

    <p> Наименование: <%= cart.getName()%> </p>
    <p> Количество: <%= cart.getQuantity()%></p>
</body>
</html>
