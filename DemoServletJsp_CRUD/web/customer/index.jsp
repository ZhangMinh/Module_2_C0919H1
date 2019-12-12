<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 26-11-2019
  Time: 8:34 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Customer Management Application</title>
</head>
<body>
<h1 style="text-align: center">Customer Management</h1>
<h2 style="text-align: center">
    <a href="new">Add New Customer</a> &nbsp &nbsp &nbsp
    <a href="edit">List All Customer</a>
</h2>
<div align="center">
    <table border="1" cellpadding="10" style="text-align: left">
        <caption><h2>List Customer</h2></caption>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Phone</th>
            <th>Mail</th>
            <th>Action</th>
        </tr>
        <%--        //Hiển thị danh sách customer--%>
        <tr>
            <c:forEach var="customer" items="${listCustomer}">
        <tr>
            <td><c:out value="${customer.getId()}"></c:out></td>
            <td><c:out value="${customer.getName()}"></c:out></td>
            <td><c:out value="${customer.getPhone()}"></c:out></td>
            <td><c:out value="${customer.getEmail()}"></c:out></td>
            <td>
                <a href="edit?id=<c:out value="${customer.getId()}" /> ">Edit</a> &nbsp&nbsp
                <a href="delete?id=<c:out value="${customer.getId()}"/> ">Delete</a>
            </td>
        </tr>
        </c:forEach>
        </tr>
    </table>
</div>
</body>
</html>