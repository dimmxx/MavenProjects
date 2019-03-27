<%
    String num1 = request.getParameter("num1");
    String num2 = request.getParameter("num2");
    String op = request.getParameter("op");

    String result = "";
    double num1_i = 0;
    double num2_i = 0;

    try {
        num1_i = Double.parseDouble(num1);
        num2_i = Double.parseDouble(num2);
    } catch (NumberFormatException e) {
        result = e.toString();
    }

    switch (op) {
        case "+":
            result = Double.toString(num1_i + num2_i);
            break;
        case "-":
            result = Double.toString(num1_i - num2_i);
            break;
        case "*":
            result = Double.toString(num1_i * num2_i);
            break;
        case "/":
            result = Double.toString(num1_i / num2_i);
            break;
        default:
            result = "Error";

    }

    out.write(num1 + op + num2 + "=" + result);


%>