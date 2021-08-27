package FileIO;

import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) throws IOException {
        File f1 = new File("JavaFile1.txt");
        if (f1.exists()) {
            System.out.println("File Exist: " + f1.exists());
        } else {
            System.out.println("File Doesnt Exist!! Creating File");
            f1.createNewFile();
            System.out.println("File Created: " + f1.exists());
        }
        System.out.println("File Size: " + f1.length());
        System.out.println("CAn Write: " + f1.canWrite());
        System.out.println("Get Name: " + f1.getName());
    }
}
