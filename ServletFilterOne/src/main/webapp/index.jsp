<%@ page import="java.util.Iterator" %>
<%@ page import="java.util.Enumeration" %>
<%@ page import="java.util.Map" %>
<html>
<body>
<h2>Hello World!</h2>


Username: <%=request.getParameter("username")%><br>
Password: <%=request.getParameter("password")%><br>
Filter: <%=request.getAttribute("filter")%><br>
session.getAttributeNames(): <%=session.getAttributeNames()%><br>

<%


    session.setAttribute("dima", "name");
    session.setAttribute("123", "pass");
    Enumeration enumeration = session.getAttributeNames();
		while (enumeration.hasMoreElements()) {
		    String item = enumeration.nextElement().toString();
			out.write(item + "<br>");
		}





%>

session.getId(): <%=session.getId()%><br>
session.getMaxInactiveInterval(): <%=session.getMaxInactiveInterval()%><br>


-------------------------<br>
request.getRequestURI(): <%=request.getRequestURI()%><br>
request.getRequestURL(): <%=request.getRequestURL()%><br>
request.getAuthType(): <%=request.getAuthType()%><br>
request.getContextPath(): <%=request.getContextPath()%><br>
request.getCookies(): <%=request.getCookies()%><br>
request.getDateHeader("1"): <%=request.getDateHeader("1")%><br>
request.getHeaderNames(): <%=request.getHeaderNames()%><br>
request.getMethod(): <%=request.getMethod()%><br>
request.getPathInfo(): <%=request.getPathInfo()%><br>
request.getPathTranslated(): <%=request.getPathTranslated()%><br>
request.getQueryString(): <%=request.getQueryString()%><br>
request.getRemoteUser(): <%=request.getRemoteUser()%><br>
request.getRequestedSessionId(): <%=request.getRequestedSessionId()%><br>
request.getServletPath(): <%=request.getServletPath()%><br>
request.getSession(): <%=request.getSession()%><br>
request.getUserPrincipal(): <%=request.getUserPrincipal()%><br>

</body>
</html>
