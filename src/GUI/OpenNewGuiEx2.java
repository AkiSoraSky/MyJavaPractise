package GUI;

import javax.swing.*;
import java.awt.*;

public class OpenNewGuiEx2 {
    JFrame frame = new JFrame();
    JLabel label = new JLabel("Hello Ji");
    
    OpenNewGuiEx2() {
        label.setBounds(0,0,100,50);
        label.setFont(new Font(null, Font.PLAIN,25));

        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350,350);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
