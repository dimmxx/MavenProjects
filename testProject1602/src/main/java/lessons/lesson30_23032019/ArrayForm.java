package lessons.lesson30_23032019;

public class ArrayForm {

    public static void main(String[] args) {

        String[][] base = {{"Login", "Name", "Age", "Ocupation", "Surname", "Color", "Team", "City", "Country", "Sex"},
                {"Submit", "Enter", "Go", "Press", "Ok", "Cancel", "Calculate", "Return", "Encounter", "Like"}};

        for(int i = 0; i < (int)(Math.random()*base[0].length); i++){
            System.out.println("<tr>");
            System.out.print("<td>" + base[0][(int)(Math.random()*base[0].length)] +"</td>");
            System.out.println("<td><input type='text' name='name'/></td>");
            System.out.println("</tr>");
        }
        System.out.println("<tr><td></td><td><input type='submit' class='sumbit' name='calc' value='" + base[1][(int)(Math.random()*base[1].length)] +"'/></td></tr>");
        



    }



}
