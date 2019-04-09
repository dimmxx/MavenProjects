<%
    String login = request.getParameter("login");
    String pass = request.getParameter("pass");


%>


<!--
<html>
<body>
<form action="">
    <table border='0'>
        <tr>
            <td>Login</td>
            <td><input type='text' name='login' value='<%out.write("" + login);%>'/></td>

        </tr>
        <tr>
            <td>Password</td>
            <td><input type='text' name='pass' value='<%=(pass!=null?pass:"")%>'/></td>
        </tr>
        <tr>
            <td></td>
            <td><input type='submit' name='go'/></td>
        </tr>
    </table>
</form>
</body>
</html>
-->


<form action="">
    <table border='0'>
        <tr>
            <td>Login</td>
            <td><input type='text' name='login'/></td>

        </tr>
        <tr>
            <td>Password</td>
            <td><input type='text' name='pass' value='<%=(pass!=null?pass:"")%>'/></td>
        </tr>
        <tr>
            <td></td>
            <td><input type='submit' name='go'/></td>
        </tr>
    </table>
</form>
