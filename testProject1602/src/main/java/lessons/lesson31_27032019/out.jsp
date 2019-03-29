<%

    String login = request.getParameter("login");
    String name = request.getParameter("name");
    String pass1 = request.getParameter("pass1");
    String pass2 = request.getParameter("pass2");

    String gender = request.getParameter("gender");
    String address = request.getParameter("address");
    String comment = request.getParameter("comment");
    String agree = request.getParameter("agree");


    boolean iferror = false;
    String errorText = "<ul>";



    if(login.isEmpty()){
        iferror = true;
        errorText += "<li>Login empty</li>";
    }

    if(name.length() < 1){
        iferror = true;
        errorText += "<li>Name empty</li>";
    }

    if(pass1.isEmpty()){
        iferror = true;
        errorText += "<li>Pass1 empty</li>";
    }

    if(pass2.isEmpty()){
        iferror = true;
        errorText += "<li>Pass2 empty</li>";
    }

    errorText += "</ul>";

    if(iferror){
        out.write(errorText);
    }else out.write("Ok");



    out.write(login + "<br>");
    out.write(name + "<br>");
    out.write(pass1 + "<br>");
    out.write(pass2 + "<br>");

    out.write(gender + "<br>");
    out.write(address + "<br>");
    out.write(comment + "<br>");
    out.write(agree + "<br>");






%>