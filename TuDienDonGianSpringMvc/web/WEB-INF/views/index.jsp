<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 04-12-2019
  Time: 9:10 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>DICTIONARY APP</title>
</head>
<body>
<form action="/dictionary" method="post">
    <fieldset>
        <legend>DICTIONARY</legend>
        <select name="choice">
            <option value="engToVi">Eng to Vietnamese</option>
            <option value="viToEng">Vietnamese to Eng</option>
        </select>
        <input name="nhapvao" value="search" type="text">
        <input type="submit" value="translate">
        <c:if test="${result!=null}">
            <p>Translate: ${result}</p>
        </c:if>

    </fieldset>
</form>
</body>
</html>
