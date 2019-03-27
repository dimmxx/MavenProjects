<!DOCTYPE html>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>


<body>
<center>
<table border='1'>

<%
int rows=3;
int cols=3;
int counter=1;

for(int i = 0; i < rows; i++){
  out.write("<tr>");

  for(int j = 0; j < cols; j++){
    out.write("<td>"+ (counter++)+ "</td>");
  }
  out.write("</tr>");
}
%>

</table>
</center>
</body>
</html>
