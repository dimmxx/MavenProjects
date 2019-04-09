<%@ page import="java.util.Date" %>
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
//Date date=new Date();
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
		}else{
			out.write(String.valueOf(++counter));
		}
}
long timeNow=0;
if(counter==3){
	form=false;
	if(timeStart==0){
		timeStart=new Date().getTime();
	}
	timeNow=new Date().getTime();
	if(((timeStart+15000)-timeNow)<=0){
		counter=0;
		form=true;
		timeStart=0;
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
<% }else{ %>
Time to unlock left:
<%
 out.write(String.valueOf(((timeStart+15000)-timeNow)/1000));
 %>
<a href='form1.jsp'><input type='submit' value='REFRESH' /></a>
<% } %>
</body>
</html>