package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonEx extends JFrame implements ActionListener {
    JButton button;
    JLabel label;

    ButtonEx() {
        ImageIcon img = new ImageIcon("point.png");
        ImageIcon img2 = new ImageIcon("unnamed.jpg");
        label = new JLabel();
        button = new JButton();

        label.setIcon(img2);
        label.setBounds(250,250,150,150);
        label.setVisible(false);

        button.setBounds(120,160,250,100);
        button.setText("Click");
        button.setFocusable(false);
        button.addActionListener(this);
        button.setIcon(img);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        //button.setBackground(Color.GRAY);
        button.setBorder(BorderFactory.createEtchedBorder());
        //button.setEnabled(false);


        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    public static void main(String[] args) {
        ButtonEx frame = new ButtonEx();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button) {
            System.out.println("Clicked!!");
            label.setVisible(true);
        }
    }
}
