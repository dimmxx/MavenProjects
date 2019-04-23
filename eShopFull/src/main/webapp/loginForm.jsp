<%@ page contentType="text/html; charset=UTF-8" %>
<%@include file="WEB-INF/view/inc/header.jsp" %>

<body style="background-color:cornflowerblue">
<h2>Login/Register</h2>

<form id='loginForm' action='./AuthServletLogIn' method='post'>
    <input type='text' placeholder='username' name='username'>
    <br><input type='password' placeholder='password' name='password'>
    <br><input type='submit' value='Log in'>
</form>

<form action="./AuthServletLogIn" method="post" />
<input type='text' placeholder='username' name='username'>
    <br><input type='password' placeholder='password' name='password'>


  <input type="submit" value="Save" name="login" />
  <input type="submit" value="Submit for Approval" name="register" />
</form>





</body>

<%@include file="WEB-INF/view/inc/footer.jsp" %>


