<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Authentication result</title>
    <style>
        form { display: inline; }
        h4 { color: white }
    </style>
</head>
<body style="background-color:tan">
<h4>${user.messageSb}</h4>

<br>SessionName: <%=session.getAttribute("sessionName") + "-" + session.getId()%>
<br>SessionCreationTime: <%=session.getCreationTime()%>
<br>SessionLastAccessedTime: <%=session.getLastAccessedTime()%>
<br>SessionMaxInactivityInterval: <%=session.getMaxInactiveInterval()%>
<br>
<br>Username: ${user.username}
<br>Password: ${user.password}
<br>Email: ${user.email}
<br>Role: ${user.role}

<br>Age: ${user.age}
<br>Address: ${user.address}
<br>Gender: ${user.gender}
<br>comment: ${user.comment}
<br>Agree: ${user.agree}

<form id='loginForm' action='loginForm.html' method='get'>
    <br><br><input type='submit' value='Log in'>
</form>

<form id='registerForm' action='registerForm.jsp' method='post'>
    <input type="hidden" name="username" value="${user.username}">
    <input type="hidden" name="email" value="${user.email}">
    <input type="hidden" name="age" value="${user.age}">
    <input type="hidden" name="comment" value="${user.comment}">
    <input type='submit' value='Register'>
</form>

</body>
</html>