package GUI;

import javax.swing.*;
import java.awt.*;

public class JframeEx {
    // JFrame = a GUI window to add components to
    public static void main(String[] args) {
        JFrame frame = new JFrame(); //creates a frame
        frame.setTitle("FirstGui!!"); //sets title of frame
        //frame.setResizable(false); //prevent frame from being resized
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);        //(JFrame.EXIT_ON_CLOSE); //exit from application
                                                                              // (JFrame.DO_NOTHING_ON_CLOSE)
        frame.setSize(420,420); //sets the x-dimension, and y-dimension of frame
        frame.setVisible(true); //make frame visible

        ImageIcon icon = new ImageIcon("corinthians-logo-41770.png"); //create imageIcon
        frame.setIconImage(icon.getImage()); //change imageIcon
        frame.getContentPane().setBackground(Color.LIGHT_GRAY); //setBackground(new Color(0,0,0) or (0x123456); //change color of background
    }
}
/* we can also create frame by extending JFrame class
* make a constructor for ex for class JframeEx
* JframeEx() {
* all statements & methods
* instead of frame.--- from above code, we use this method
* ie, this.setTitle("---")
* end ----- call from main class by making object
* }}
 */