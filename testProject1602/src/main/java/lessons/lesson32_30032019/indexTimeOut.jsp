<%@ page import="java.util.Date" %>
<%!int counter = 0; %>


<%
    String login = request.getParameter("login");
    String pass = request.getParameter("pass");
    long timeStart = System.currentTimeMillis();

    boolean showForm = true;
    boolean isBlocked = false;

    if(login!=null) {

        if (pass.equals("admin") && login.equals("admin")) {
            out.write("<br><font color='lime' size='+3'>Access granted</font></br>");
            showForm = false;
        } else{
            out.write("" + counter);
            counter++;
            if(counter > 2){
                isBlocked = true;
                out.write("" + timeStart);
                out.write("<br>" + (System.currentTimeMillis() - timeStart)/1000 + "</br>");
                out.write("<br>Access denied</font></br>");
                showForm = false;
                if((System.currentTimeMillis() - timeStart) > 15000){
                    counter = 0;
                    isBlocked = false;
                }
            }
        }
    }

    if (showForm) {
%>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title></title>
    <meta charset="UTF-8"/>
    <link href="style.css" rel="stylesheet"/>
</head>

<body>

<form id="loginForm" action="" method="post">

    <div class="field">
        <label>Enter your login:</label>
        <div class="input"><input type="text" name="login" value="" id="login"/></div>
    </div>

    <div class="field">
        <a href="#" id="forgot">Forgot your password?</a>
        <label>Enter your password:</label>
        <div class="input"><input type="password" name="pass" value="" id="pass"/></div>
    </div>

    <div class="submit">
        <button type="submit">Enter</button>
        <label id="remember"><input name="" type="checkbox" value=""/> Remember me</label>
    </div>

</form>


<%
    }
    if(isBlocked){
%>

<a href='indexTimeOut.jsp'><input type='submit' value='Refresh'/></a>

<%
    }
%>


</body>
</html>