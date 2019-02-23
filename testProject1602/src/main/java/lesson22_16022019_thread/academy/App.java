package lesson22_16022019_thread.man.academy;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * Hello world!
 *
 */
public class App extends JFrame
{

    URL url1 = this.getClass().getClassLoader().getResource("England.png");
    URL url2 = this.getClass().getClassLoader().getResource("images/France.png");

    JLabel l1 = new JLabel(new ImageIcon(url1));
    JLabel l2 = new JLabel(new ImageIcon(url2));


    App(){
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 2));
        panel.add(l1);
        panel.add(l2);
        add(panel);

        setSize(300,300);
        setVisible(true);
        setDefaultCloseOperation(3);

    }

    public static void main( String[] args )
    {
        new App();
    }
}
