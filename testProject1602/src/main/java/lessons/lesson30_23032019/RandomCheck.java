package lessons.lesson30_23032019;

public class RandomCheck {

    public static void main(String[] args) {

        String[][] base = {{"Login", "Name", "Age", "Ocupation", "Surname", "Color", "Team", "City", "Country", "Sex"},
                {"Submit", "Enter", "Go", "Press", "Ok", "Cancel", "Calculate", "Return", "Encounter", "Like"}};


        System.out.println(base.length);
        System.out.println(base[0].length);
        System.out.println(base[1].length);

        for(int i = 0; i < 100; i++) {
            System.out.print((int)(Math.random() * base[0].length) + " ");
        }


        //System.out.println("<td><input type='text' name='name'/></td>");
        //System.out.println("</tr>");


    }


}
