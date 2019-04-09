<%@ page import="lessons.lesson32_30032019.com.google.LoginController" %>

<%
LoginController controller = new LoginController();
out.write(controller.authorize("admin", "123"));

%>