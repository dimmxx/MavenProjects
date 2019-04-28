package mate.academy.p7_filewriter1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        PrintStream printStreamFile = new PrintStream(new File("output.txt"));

        PrintStream printStreamConsole = System.out;

        System.setOut(printStreamFile);

        for(int i = 0; i < 10; i++){
            System.out.print(i);
        }







    }




}
