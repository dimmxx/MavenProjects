<html>
<body>
<form action="">
    <table border='0'>
<%
String[][] base = {{"Login", "Name", "Age", "Ocupation", "Surname", "Color", "Team", "City", "Country", "Sex"},
                {"Submit", "Enter", "Go", "Press", "Ok", "Cancel", "Calculate", "Return", "Encounter", "Like"}};

        int loop = (int)(Math.random()*base[0].length);

        for(int i = 0; i < loop; i++){
            out.write("<tr>");
            out.write("<td>" + base[0][(int)(Math.random()*base[0].length)] +"</td>");
            out.write("<td><input type='text' name='name'/></td>");
            out.write("</tr>");
        }
        out.write("<tr><td></td><td><input type='submit' class='sumbit' name='calc' value='" + base[1][(int)(Math.random()*base[1].length)] +"'/></td></tr>");

response.setIntHeader("Refresh", 5);
%>
        </table>
</form>
<button type="button" onClick="refreshPage()">Refresh</button>
<script>
function refreshPage(){
    window.location.reload();
}
</script>
</body>
</html>