package FileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFromBuffer {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("JavaFile1.txt"));
        int ch;
        while((ch=br.read())!=-1) {
            System.out.print((char)ch);
        }
        br.close();
    }
}
