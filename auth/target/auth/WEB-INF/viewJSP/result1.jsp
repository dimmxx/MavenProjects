<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>UserInfo</title>
</head>
<body>
<h3>${user.messageSb}</h3>

Username: ${user.username}
<br>Password: ${user.password}
<br>Email: ${user.email}
<br>Role: ${user.role}

<br>Age: ${user.age}
<br>Address: ${user.address}
<br>Gender: ${user.gender}
<br>comment: ${user.comment}
<br>Agree: ${user.agree}
<br>Gender: ${user.gender}







<form id='loginForm' action='loginForm.html' method='get'>
    <br><input type='submit' value='Log in'>
</form>

<form id='registerForm' action='registerForm.html' method='post'>
    <input type='submit' value='Register'>
</form>

</body>
</html>