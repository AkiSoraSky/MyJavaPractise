package FileIO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFromBuffer {
    public static void main(String[] args) throws IOException{
        BufferedWriter bf = new BufferedWriter( new FileWriter("JavaFile2.txt",true));
        bf.write("This is new File. ");
        bf.close();
    }
}
