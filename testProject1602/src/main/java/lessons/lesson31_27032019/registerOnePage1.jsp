<html>
<body>

<%
    String login = request.getParameter("login");
    boolean showForm = true;
    if (login != null){
        out.write("Validating ...<br>");
        if(login.equals("123")){
            out.write("<br>Accsess granted</br>");
            showForm = false;
        }
    }

    if (showForm){
%>

<form action=''>Login<input type='text' name='login'/><input type='submit' class='sumbit' name='calc' value='Register'/></form>

<%
    }
%>

</body>
</html>