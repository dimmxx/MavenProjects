<%@ page language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@include file="inc/header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <title>Title</title>
</head>
<body style="background-color:cornflowerblue;">


<c:forEach items="${products}" var="product">
    <table border="0">
    <tr>
        <td width="200">${product.productName}</td>
        <td width="500"></td>
    </tr>
    <tr>
        <td width="200"><img src="./static/images/${product.image}" width="200"></td>
        <td width="500">${product.description}</td>
    </tr>
    <tr>
        <td width="200">${product.price}$</td>
        <td width="500">
            <form action="./CartServlet" method="post">
                <input type="hidden" name="productId" value="${product.id}">
                <input type="submit" value="buy" style="height:50px; width:100px"/>
            </form>
        </td>
    </tr>
    </table><br><br>
</c:forEach>

</body>
</html>
<%@include file="inc/footer.jsp" %>