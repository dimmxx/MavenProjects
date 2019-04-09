<%
    String login = request.getParameter("login");
    String pass = request.getParameter("pass");

    boolean showForm = true;

    if(login!=null) {

        if (pass.equals("admin") && login.equals("admin")) {
            out.write("<br><font color='lime' size='+3'>Access granted</font></br>");
            showForm = false;
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

</body>
</html>
<%
    }
%>