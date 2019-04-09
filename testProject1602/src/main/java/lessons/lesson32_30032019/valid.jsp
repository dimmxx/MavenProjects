
<%@ page import="lessons.lesson32_30032019.Valid" %>
<%! private int counter=0; %>
<%! private long timeStart=0; %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title></title>
	<meta charset="UTF-8" />
	<link href="style.css" rel="stylesheet" />
</head>
<body>
<%

boolean form=true;
	String login=request.getParameter("login");
	String password=request.getParameter("password");

    Valid valid = new Valid(login, password);


	if(valid.valid(login, password)){

}

if(form){
	%>
<form id="loginForm" action="" method="post">

	<div class="field">
		<label>Enter your login:</label>
		<div class="input"><input type="text" name="login" value="" id="login" /></div>
	</div>

	<div class="field">
		<a href="#" id="forgot">Forgot your password?</a>
		<label>Enter your password:</label>
		<div class="input"><input type="password" name="password" value="" id="pass" /></div>
	</div>

	<div class="submit">
		<button type="submit">Enter</button>
		<label id="remember"><input name="" type="checkbox" value="" /> Remember me</label>
	</div>

</form>
<% }else{ %>
Time to unlock left:
<%
 out.write(String.valueOf(((timeStart+15000)-timeNow)/1000));
 %>
<a href='form1.jsp'><input type='submit' value='REFRESH' /></a>
<% } %>
</body>
</html>