package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListenerEx extends JFrame implements MouseListener {
    JLabel label;
    ImageIcon smile;
    ImageIcon shocked;
    ImageIcon think;
    ImageIcon nervous;
    ImageIcon pain;

    MouseListenerEx(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,600);
        this.setLayout(new FlowLayout());

        label = new JLabel();
        label.addMouseListener(this);
//        label.setBounds(0, 0, 100, 100);
//        label.setBackground(Color.red);
//        label.setOpaque(true);
//        label.addMouseListener(this);

        smile = new ImageIcon("smile.png");
        shocked = new ImageIcon("shocked.png");
        think = new ImageIcon("asd.png");
        nervous = new ImageIcon("nervous.png");
        pain = new ImageIcon("pain.png");

        label.setIcon(smile);
        this.add(label);
        this.setVisible(true);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        // Invoked when the mouse button has been clicked (pressed and released) on a component
        //System.out.println("You clicked the mouse");
        //label.setIcon(shocked);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // Invoked when a mouse button has been pressed on a component
//        System.out.println("You pressed the mouse");
//        label.setBackground(Color.yellow);
          label.setIcon(nervous);

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // Invoked when a mouse button has been released on a component
//        System.out.println("You released the mouse");
//        label.setBackground(Color.green);
          label.setIcon(pain);

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // Invoked when the mouse enters a component
//        System.out.println("You entered the component");
//        label.setBackground(Color.blue);
          label.setIcon(think);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // Invoked when the mouse exits a component
//        System.out.println("You exited the component");
//        label.setBackground(Color.red);
        label.setIcon(smile);
    }

    public static void main(String[] args) {
        new MouseListenerEx();
    }
}
