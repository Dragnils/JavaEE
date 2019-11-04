<%--
  Created by IntelliJ IDEA.
  User: Anuarbek
  Date: 01.11.2019
  Time: 8:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>First JSP</title>
</head>
<body>
    <h1>Testing JSP</h1>
    <p>
        <%@ page import="java.util.Date, logic.TestClass"%> <!-- директива, с помощью которой можно импортировать библиотеки, классы из пакетов -->

        <% Date now = new Date();
            String str = "Текущая дата : " + now;
        %> <!-- не выводит на экран ничего, здесь можно описывать логику java кода -->

        <%= str %><!-- обязаны вернуть объект класса Стринг и этот объект вставится на html-->
        <br>
        <% TestClass testClass = new TestClass(); %>
        <%= testClass.getInfo()%>
    <hr>
        <br>
        <%
            out.println("Hello world"); // переменная out позволяет  в данных тегах выводить строку на страницу html
        %>
    <hr>
        <br>
        <%
            for (int i = 0; i < 10; i++) {
                out.println("<p>" + "Hello :" + i + ";" + "</p>");
            }
        %>
    <hr>
    <br>
        <p>
            <% String name = request.getParameter("name"); %>
            <%= "Hello, " + name%>
        </p>
    </p>
</body>
</html>
