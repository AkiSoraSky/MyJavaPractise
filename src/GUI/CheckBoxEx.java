package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBoxEx extends JFrame implements ActionListener {

    JButton button;
    JCheckBox checkBox;
    ImageIcon xIcon;
    ImageIcon checkIcon;

    CheckBoxEx(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        xIcon = new ImageIcon("no.png");
        checkIcon = new ImageIcon("yes.png");

        button = new JButton();
        button.setText("submit");
        button.addActionListener(this);
        button.setFocusable(false);

        checkBox = new JCheckBox();
        checkBox.setText("I'm not a robot");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Consolas",Font.PLAIN,35));
        checkBox.setIcon(xIcon);
        checkBox.setSelectedIcon(checkIcon);

        this.add(button);
        this.add(checkBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button) {
            System.out.println(checkBox.isSelected());
        }
    }

    public static void main(String[] args) {

        // JCheckBox = A GUI component that can be selected or deselected

        new CheckBoxEx();

    }
}

