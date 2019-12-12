<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 22-11-2019
  Time: 9:08 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sieu thi mini</title>
  <style>
  .lblCustom{
    width: 200px;
    display: inline-block;
  }

  </style>
</head>
<div id="content">
    <h1>Product Discount Calculator</h1>
    <form class="lblCustom" action="/result.jsp" method="post">
        <div id="data">
            <label class="lblCustom">Product Description</label>
            <input type="text" name="description">
            <br>
            <label class="lblCustom">Price</label>
            <input type="text" name="price">
            <br>
            <label class="lblCustom">Discount Percent</label>
            <input type="text" name="discount">
        </div>
        <div>
            <br>
            <input type="submit" value="Discount Product">
        </div>
    </form>
</div>
</html>
