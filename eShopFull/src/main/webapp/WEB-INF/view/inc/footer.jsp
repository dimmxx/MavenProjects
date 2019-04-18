<%@ page language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<div id="sidebar">

        <table border=1>
        <tr>
        <td width="252" align="left">
        <font color=white>
        Вы авторизировались как Антон<br />
        В вашей корзине ${sessionScope.cart.size} товаров.
        </font>
        </td>
        </tr>
        </table>
        <h2>Боковое меню</h2>
<ul>
<li><a href="./ProductServlet?category=1">Категория 1 - Мобильные телефоны</a></li>
<li><a href="./ProductServlet?category=2">Категория 2 - Фотоаппаратура</a></li>
<li><a href="./ProductServlet?category=3">Категория 3 - Компьютерная техника</a></li>
<li><a href="./ProductServlet?category=all">Все категории товаров</2></li>

<li><a href="registration.php">Регистрация</a></li>
<li><a href="login.php">Вход</a></li>
<li><a href="./CartServlet">Корзина</a></li>
</ul>
</div>

<div id="footer">
<p>Copyright (c) by Бондаренко Антон</p>
</div>
<!-- end #footer -->
</body>
</html>
