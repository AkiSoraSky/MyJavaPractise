package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButtonEx extends JFrame implements ActionListener {

    JRadioButton pizzaButton;
    JRadioButton hamburgerButton;
    JRadioButton hotdogButton;
    RadioButtonEx(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        pizzaButton = new JRadioButton("pizza");
        hamburgerButton = new JRadioButton("hamburger");
        hotdogButton = new JRadioButton("hotdog");

        ButtonGroup group = new ButtonGroup();
        group.add(pizzaButton);
        group.add(hamburgerButton);
        group.add(hotdogButton);

        pizzaButton.addActionListener(this);
        hamburgerButton.addActionListener(this);
        hotdogButton.addActionListener(this);

        this.add(pizzaButton);
        this.add(hamburgerButton);
        this.add(hotdogButton);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==pizzaButton) {
            System.out.println("You ordered pizza!");
        }
        else if(e.getSource()==hamburgerButton) {
            System.out.println("You ordered a hamburger!");
        }
        else if(e.getSource()==hotdogButton) {
            System.out.println("You ordered a hotdog!");
        }
    }

    public static void main(String[] args) {

            // JRadioButton = One or more buttons in a grouping in which only 1 may be selected per group

            new RadioButtonEx();

        }
    }
