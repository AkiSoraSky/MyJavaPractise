package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OpenNewGuiEx implements ActionListener {
    JFrame frame = new JFrame();
    JButton myButton = new JButton("New Window!");

    OpenNewGuiEx() {
        myButton.setBounds(120,160, 200,40);
        myButton.setFocusable(false);
        myButton.addActionListener(this);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450,450);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(myButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==myButton) {
            frame.dispose();
            OpenNewGuiEx2 newWin = new OpenNewGuiEx2();
        }
    }
    public static void main(String[] args) {
        OpenNewGuiEx launchPage = new OpenNewGuiEx();
    }
}
