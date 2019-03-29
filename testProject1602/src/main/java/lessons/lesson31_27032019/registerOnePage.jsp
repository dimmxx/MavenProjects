<html>
<body>

<%
    String form = "<form action=''>Login<input type='text' name='login'/><input type='submit' class='sumbit' name='calc' value='Register'/></form>";

    String login = request.getParameter("login");
    if (login == null){
        out.write(form);
    } else {
        out.write("Validating");
        if (login.equals("123")) {
            out.write("<br>Accsess granted</br>");
        } else {
            out.write(form);
        }
    }
%>

</body>
</html>