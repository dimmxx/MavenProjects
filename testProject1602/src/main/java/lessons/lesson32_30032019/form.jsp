<%
	String login=request.getParameter("login");
	String password=request.getParameter("password");
	String gender=request.getParameter("gender");
	String address=request.getParameter("address");
	String errorText="";
if(login!=null){
		if(login.isEmpty()){
				errorText+="Empty Login<br>";
		}
		if(password.isEmpty()){
				errorText+="Empty Password<br>";
		}
}
	out.write(errorText);
	out.write(""+address);
%>
<hr>
<center>
<form action=''>
<table border='0'>
	<tr>
		<td>Login</td>
		<td><input type='text' name='login' value='<%=(login!=null?login:"")%>'/></td>
	</tr>
	<tr>
		<td>Password</td>
		<td><input type='text' name='password'/></td>
	</tr>
	<tr>
		<td>Gender</td>
		<td>M<input type='radio' name='gender' 
		<%=(gender!=null && gender.equals("male")?"checked":"")%> value='male'/>
		    F<input type='radio' name='gender' 
			<%=(gender!=null && gender.equals("female")?"checked":"")%> value='female'/>
		</td>
	</tr>
	<tr>
		<td>Address</td>
		<td><select name='address'>
		<option value='1' 
		<%=(address!=null && address.equals("1")?"selected":"")%>>LNR</option>
		<option value='2'
		<%=(address!=null && address.equals("2")?"selected":"")%>
		>DNR</option>
		<option value='3' 
		<%=(address!=null && address.equals("3")?"selected":"")%>
		>CNR</option>
		<select></td>
	</tr>
	<tr>
		<td></td>
		<td align='right'><input type='submit' value='SEND'/></td>
	</tr>
</table>
</form>
</center>
