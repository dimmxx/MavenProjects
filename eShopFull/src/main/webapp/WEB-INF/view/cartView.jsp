<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <title>Cart</title>
</head>
<body style="background-color:linen;">

<center>

<c:forEach items="${cart.productList}" var="product">
    <table border="0">
    <tr>
        <td width="200">${product.productName}</td>
        <td width="300"></td>
    </tr>
    <tr>
        <td width="200"><img src="./static/images/${product.image}" width="200"></td>
        <td width="300">${product.description}</td>
    </tr>
    <tr>
        <td width="200">${product.price}</td>
        <td width="300"><input type="submit" value="buy"/></td>
    </tr>
    </table><br><br>
</c:forEach>





</body>
</html>
