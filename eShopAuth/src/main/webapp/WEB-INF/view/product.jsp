<%@ page language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@include file="inc/header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <title>Title</title>
    <style type="text/css">
        tab1 { padding-left: 2em; }
    </style>
</head>
<body style="background-color:cornflowerblue;">
<h2>Product list</h2>
<!--
<div id="p1b">Product#1</div>
<div><img src="minus.png" onclick="minus('p1')" width="25px" height="25px"/>
  <span id="p1">1</span>
<img src="plus.png" onclick="plus('p1')" width="25px" height="25px"/></div>
<div><input onclick="buy('p1')" type="button" value="Buy"/></div>
<hr>
-->

<c:forEach items="${products}" var="product" varStatus="count">
    <table border="1">
        <tr>
            <td width="110">Product code:</td>
            <td width="50">
                <div id="${count.count}-${product.id}p">${product.id}</div>
            </td>
            <td width="200"></td>
            <td width="500"><h3>${product.productName}</h3></td>
            <td style="text-align: right" width="200">$${product.price}.00</td>
        </tr>
        <tr>
            <td width="110"></td>
            <td width="50"></td>
            <td width="200"><img src="./static/images/${product.image}" width="200"></td>
            <td width="500">${product.description}</td>
            <td></td>
        </tr>
        <tr>
            <td width="110"></td>
            <td width="50"></td>
            <td style="text-align: center" width="200">
                <form action="./CartServlet" method="post">
                    <input type="hidden" name="productId" value="${product.id}">
                    <input type="submit" value="Add 1 to the cart" style="height:30px; width:130px"/>
                </form>
            </td>
            <td style="text-align: right" width="500">
                <div><img src="./static/images/minus_btn.png" onclick="minus('${count.count}-${product.id}pq')" width="25px" height="25px"/>
                    <span id="${count.count}-${product.id}pq">1<tab1></tab1></span>
                    <img src="./static/images/plus_btn.png" onclick="plus('${count.count}-${product.id}pq')" width="25px" height="25px"/>
                </div>
            </td>
            <td style="text-align: center" width="200">
                <div><input onclick="buy('p1')" type="button" value="Add to the cart"/></div>
            </td>
        </tr>
    </table>
    <br><br>
</c:forEach>

<script>

   function minus(id){
  var product = document.getElementById(id);
  var temp = +product.innerHTML - 1;
  product.innerHTML = temp;
}

function plus(id){
  var product = document.getElementById(id);
  var temp = +product.innerHTML + 1;
  product.innerHTML = temp;
}





</script>
</body>
</html>
<%@include file="inc/footer.jsp" %>