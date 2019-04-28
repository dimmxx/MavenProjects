package mate.academy.p8_filewriter2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File("output.txt");

        FileWriter fw = new FileWriter(file, true);

        for(int j = 100; j > 0; j--){
            fw.write(String.valueOf(j));
            fw.write("-");
            System.out.print(j);
        }

        fw.flush();
        fw.close();

    }

}
