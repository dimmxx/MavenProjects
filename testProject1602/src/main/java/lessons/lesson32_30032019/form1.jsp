
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
	String gender=request.getParameter("gender");
	String address=request.getParameter("address");
	String errorText="";
if(login!=null){
		if(login.equals("admin") && password.equals("123")){
				out.write("Access granted");
				form=false;
		}	
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
<% } %>
</body>
</html>