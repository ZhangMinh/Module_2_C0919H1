<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 22-11-2019
  Time: 9:17 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
<%
    String description = request.getParameter ( "description" );
    float price = Float.parseFloat ( request.getParameter ( "price" ) );
    int discount_percent = Integer.parseInt ( request.getParameter ( "discount" ) );
    float discount = price * discount_percent/100;
    float total = price - discount;
%>

<h1>Product Description: <%=description%></h1>
<h1>Price: <%=price%></h1>
<h1>Sale off: <%=discount_percent%></h1>
<h1>Product discount: <%=discount%></h1>
<h1>Product Total: <%=total%></h1>

</body>
</html>
