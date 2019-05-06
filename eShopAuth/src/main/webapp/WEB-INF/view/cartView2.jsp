<%@ page language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@include file="inc/header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <title>Cart</title>
</head>
<body style="background-color:cornflowerblue;">

<c:forEach var="mapEntry" items="${cart.productMap}" varStatus="count">
    <table border="1">
        <tr>
            <td><img src="./static/images/delete.png" width="20"></td>
            <td>${count.count}.</td>
            <td>${mapEntry.key.id}</td>
            <td><img src="./static/images/${mapEntry.key.image}" width="30"></td>
            <td>${mapEntry.key.productName}</td>
            <td>${mapEntry.key.price}$</td>
            <td>Quantity: ${mapEntry.value}</td>
            <td>Sum</td>
            <td>Button1</td>
        </tr>
    </table>
    <br><br>
</c:forEach>


</body>
</html>


<%@include file="inc/footer.jsp" %>
