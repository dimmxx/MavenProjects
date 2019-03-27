<%
    String login = request.getParameter("login");
    String pass = request.getParameter("password");

    if (login != null && login.equals("admin") && pass != null && pass.equals("123")) {
        out.write("<p style='color:green'>ACCESS GRANTED</p><br>");
    }else {
        out.write("<p style='color:red'>ACCESS DENIED</p><br>");
    }
%>