package mate.academy;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Path;
import java.util.Scanner;

public class GrEngine extends JFrame {


    Image icon1 = ImageIO.read(getClass().getResource("/images/France.png"));
    JLabel labelImage1 = new JLabel(new ImageIcon(icon1));

    Image icon2 = ImageIO.read(getClass().getResource("/images/png/England.png"));
    JLabel labelImage2 = new JLabel(new ImageIcon(icon2));

    URL text1URL = getClass().getResource("/text/innerText.txt");

    //JLabel labelImage1 = new JLabel(new ImageIcon("src/main/resources/images/France.png"));
    //JLabel labelImage2 = new JLabel(new ImageIcon("images/png/England.png"));

    JTextArea textArea1 = new JTextArea();
    JTextArea textArea2 = new JTextArea();

    public GrEngine() throws IOException {
        super("Maven");

        JPanel panel = new JPanel(new GridLayout(2, 2));


        textArea1.setLineWrap(true);
        textArea1.setText(readTextFileU(text1URL));


        textArea2.setLineWrap(true);
        textArea2.setText(readTextFile("outerText.txt"));


        panel.add(labelImage1);
        panel.add(textArea1);

        panel.add(labelImage2);
        panel.add(textArea2);


        add(panel);

        setSize(700, 700);
        setVisible(true);
        setDefaultCloseOperation(3);

    }

    private String readTextFile(String path) {

        StringBuilder content = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String sCurrentLine;

            while ((sCurrentLine = br.readLine()) != null) {
                content.append(sCurrentLine).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }


     private String readTextFileU(URL url) throws IOException {

        Scanner sc = new Scanner(url.openStream());
        StringBuilder content = new StringBuilder();

        while (sc.hasNextLine()){
            content.append(sc.nextLine()).append("\n");
        }

        return content.toString();
    }

}
