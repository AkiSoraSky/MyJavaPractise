package GUI;

import javax.swing.*;

public class JoptionPaneEx {
    public static void main(String[] args) {
        //JOptionPane = pop up a standard dialog box that prompts users for a value
        //				or informs them of something.
        //JOptionPane.showMessageDialog(null,"This is Info","title",JOptionPane.PLAIN_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Here is useless info", "title", JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "really?", "title", JOptionPane.QUESTION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Your computer has a VIRUS!", "title", JOptionPane.WARNING_MESSAGE);
        //JOptionPane.showMessageDialog(null, "CALL TECH SUPPORT OR ELSE!", "title", JOptionPane.ERROR_MESSAGE);

        //int answer = JOptionPane.showConfirmDialog(null, "bro,do u even code?","This is my Title",JOptionPane.YES_NO_CANCEL_OPTION);
        //String name = JOptionPane.showInputDialog("What is Your Name?");
        String[] responses = {"Mostly","Yes","NO"};
        ImageIcon icon = new ImageIcon("unnamed.png");
        JOptionPane.showOptionDialog(null,"Done Already","secret Options",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,icon,responses,0);
    }
}
