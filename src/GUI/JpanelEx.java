package GUI;

import javax.swing.*;
import java.awt.*;

public class JpanelEx {
    public static void main(String[] args) {
        // JPanel = a GUI component that functions as a container to hold other components
        JLabel label = new JLabel();
        label.setText("Practise!!");

        JPanel orangePanel = new JPanel();
        orangePanel.setBackground(Color.ORANGE);
        orangePanel.setBounds(0,0,250,250);

        JPanel panelTwo = new JPanel();
        panelTwo.setBackground(Color.lightGray);
        panelTwo.setBounds(250,0,250,250);

        JPanel panelThree = new JPanel();
        panelThree.setBackground(Color.CYAN);
        panelThree.setBounds(0,250,750,250);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750,750);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(orangePanel);
        frame.add(panelTwo);
        frame.add(panelThree);
        panelTwo.add(label);
    }
}
