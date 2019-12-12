<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 03-12-2019
  Time: 10:47 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Change money</title>
</head>
<body>
<h1>Change money Application</h1>

<form action="/chuyendoi" method="post">
    <select name="select">
        <option name="usdToVnd" value="usdToVnd">Usd to Vnd</option>
        <option name="vndToUsd" value="vndToUsd">Vnd to Usd</option>
    </select>

    <input type="text" name="money" id="money">

    <input type="submit" value="Change">
    <p id="result">Result:${result} </p>
</form>

</body>
</html>
