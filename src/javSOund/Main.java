package javSOund;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Scanner sc = new Scanner(System.in);

        File file = new File("file_example_WAV_2MG.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        
        String response= " ";
        while (!(response.equals("Q"))) {
            System.out.println("P = Play\nQ = Quit\nS = Stop \nR = Reset");
            System.out.println("Enter Your Choice: ");
            response = sc.next().toUpperCase();

            switch (response) {
                case ("P") -> clip.start();
                case ("S") -> clip.stop();
                case ("R") -> clip.setMicrosecondPosition(0);
                case ("Q") -> clip.close();
                default -> System.out.println("Invalid Response!!");
            }
        }
        System.out.println("Program Stopped!!!!");
    }
}
