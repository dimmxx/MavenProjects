<%@ page language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@include file="inc/header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <title>Cart</title>
</head>
<body style="background-color:cornflowerblue;">

<c:forEach var="mapEntry" items="${cart.productMap}">
    <table border="0">
    <tr>
        <td width="200">${mapEntry.key.productName} </td>
        <td width="500">Quantity: ${mapEntry.value}</td>
    </tr>
    <tr>
        <td width="200"><img src="./static/images/${mapEntry.key.image}" width="200"></td>
        <td width="500">${mapEntry.key.description}</td>
    </tr>
    <tr>
        <td width="200">${mapEntry.key.price}$</td>
    </tr>
    </table><br><br>
</c:forEach>


<table border="1">
    <tr>
        <td width="200">Product quantity: ${cart.mapProductQuantity}</td>
        <td width="500">Total amount: ${cart.mapTotalAmount}$</td>
        <td width="200"><input type="submit" value="Checkout"/></td>
    </tr>
    </table><br><br>


<a href="./ShowServlet">Continue shopping</a>

</body>
</html>