<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body style="background-color:tan">
<h2>Login</h2>

<form id='loginForm' action='./AuthServletLogin' method='post'>
    <input type='text' placeholder='username' name='username'>
    <br><input type='password' placeholder='password' name='password'>
    <br><input type='submit' value='Log in'>
</form>
</body>

</html>