<%@ page language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@include file="inc/header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <title>Cart</title>
</head>
<body style="background-color:cornflowerblue;">

<script src="https://code.jquery.com/jquery-3.4.0.js"
        integrity="sha256-DYZMCC8HTC+QDr5QNaIcfR7VSPtcISykd+6eSmBW5qo="
        crossorigin="anonymous"></script>

<script src="./JS/cart.js"></script>


<table border="1">
    <tr>
            <td>Delete</td>
            <td>No</td>
            <td>Product id</td>
            <td>Product image</td>
            <td>Product</td>
            <td>Price</td>
            <td></td>
            <td>Sum</td>
            <td>Change</td>
        </tr>

<c:forEach var="mapEntry" items="${cart.productMap}" varStatus="count">
        <tr>

            <td style="text-align: center"><img src="./static/images/delete.png" onclick="deleteItem('${mapEntry.key.id}')" width="20"></td>
            <td style="text-align: center">${count.count}</td>
            <td id="${mapEntry.key.id}" style="text-align: center">${mapEntry.key.id}</td>
            <td style="text-align: center"><img src="./static/images/${mapEntry.key.image}" width="30"></td>
            <td>${mapEntry.key.productName}</td>
            <td style="text-align: center">${mapEntry.key.price}$</td>
            <td style="text-align: center"><input type="text" id="num1" value="${mapEntry.value}"/>
                <input type="hidden" id="${mapEntry.key.productName}" value="${mapEntry.key}"/>
            </td>
            <td style="text-align: center">Sum</td>
            <td style="text-align: center">Button1</td>
        </tr>

</c:forEach>

</table>

</body>
</html>


<%@include file="inc/footer.jsp" %>
