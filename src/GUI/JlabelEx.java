package GUI;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class JlabelEx {
    public static void main(String[] args) {
        // JLabel = a GUI display area for a string of text, an image, or both
        JLabel label = new JLabel(); //can also be written inside JLabel("--");
        label.setText("This is Jlabel");

        ImageIcon img = new ImageIcon("map-961700_640.png");
        Border border = BorderFactory.createLineBorder(Color.GREEN,2);
        label.setIcon(img);
        label.setHorizontalTextPosition(JLabel.CENTER); // //set text LEFT,CENTER, RIGHT of imageicon
        label.setVerticalTextPosition(JLabel.NORTH);
        label.setForeground(new Color(245,245,245));
        label.setFont(new Font("MV Boli",Font.BOLD, 20));
        label.setIconTextGap(-25);
        label.setBackground(Color.black);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon+text within label(remains in center after resizing)
        label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of icon+text within label

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(700,500);
       // frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();
    }
}
