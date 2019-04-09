<%@ page import="java.util.regex.Pattern" %>
<%@ page import="java.util.regex.Matcher" %>
<%
    String login = request.getParameter("login");
    String name = request.getParameter("name");
    String pass1 = request.getParameter("pass1");
    String pass2 = request.getParameter("pass2");
    String gender = request.getParameter("gender");
    String address = request.getParameter("address");

    final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    final Pattern VALID_NAME_REGEX =
            Pattern.compile("^[A-Za-z]{3,8}$");
    final Pattern VALID_PASS_REGEX =
            Pattern.compile("^[A-Za-z0-9]{3,8}$");

    Matcher matcher;

    boolean showForm = true;
    boolean ifError = false;
    StringBuilder sb = new StringBuilder();
    sb.append("<ul>");

    if (login != null) {
        out.write("Validating started ...<br>");

        if (login.isEmpty()) {
            ifError = true;
            sb.append("<li>Login empty</li>");
        }
        matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(login);
        if (!matcher.find()) {
            ifError = true;
            sb.append("<li>Invalid login (Looks not like email address)</li>");
        }

        if (name.length() < 1) {
            ifError = true;
            sb.append("<li>Name empty</li>");
        }
        matcher = VALID_NAME_REGEX.matcher(name);
        if (!matcher.find()) {
            ifError = true;
            sb.append("<li>Invalid name (3-8 letters only)</li>");
        }

        if (pass1.length() == 0) {
            ifError = true;
            sb.append("<li>Pass1 empty</li>");
        }

        if (!pass1.equals(pass2)) {
            ifError = true;
            sb.append("<li>Passwords do not match</li>");
        }

        matcher = VALID_PASS_REGEX.matcher(pass1);
        if (!matcher.find()) {
            ifError = true;
            sb.append("<li>Invalid password1 (3-8 letters and numbers)</li>");
        }

        if (pass2.isEmpty()) {
            ifError = true;
            sb.append("<li>Pass2 empty</li>");
        }
        matcher = VALID_PASS_REGEX.matcher(pass2);
        if (!matcher.find()) {
            ifError = true;
            sb.append("<li>Invalid password2 (3-8 letters and numbers)</li>");
        }

        if (pass2.equals("12q")) {
            out.write("<br><font color='lime' size='+3'>Access granted</font></br>");
            showForm = false;
        }
    }

    if (showForm) {
%>

<html>
<body>
<form action=''>
    <table border='0'>
        <tr>
            <td>Login</td>
            <td><input type='text' name='login'/></td>
        </tr>
        <tr>
            <td>Name</td>
            <td><input type='text' name='name'/></td>
            <td><font color="#dc143c">
                <%
                    if (ifError) {
                        sb.append("</ul>");
                        out.write(sb.toString());
                    }
                %>
            </font>
            </td>
        </tr>
        <tr>
            <td>Password</td>
            <td><input type='password' name='pass1'/></td>
        </tr>
        <tr>
            <td>Retype password</td>
            <td><input type='password' name='pass2'/></td>
        </tr>
        <tr>
            <td>Male</td>
            <td><input type='radio' value='man' name='gender'/></td>
        </tr>
        <tr>
            <td>Female</td>
            <td><input type='radio' value='man' name='gender'/></td>
        </tr>
        <tr>
            <td>Address</td>
            <td>
                <select name='address'>
                    <option value='1'>Ukraine</option>
                    <option value='2'>Spain</option>
                    <option value='3'>France</option>
                    <option value='4'>Italy</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>Comment</td>
            <td><textarea cols='20' rows='10' name='comment'></textarea></td>
        </tr>
        <tr>
            <td>Agreement</td>
            <td><input type='checkbox' name='agree'/></td>
        </tr>
        <tr>
            <td></td>
            <td><input type='submit' class='sumbit' name='calc' value='Register'/></td>
        </tr>
    </table>
</form>
</body>
</html>

<%
    }
%>