package FileIO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class filesOutInStream {
    public static void main(String[] args) throws IOException {
        File f1 = new File("JavaFile1.txt");
        FileOutputStream fout = new FileOutputStream("f1",true);
        String s = ". Appending the file through Program";

        char[] ch = s.toCharArray();
        for(int i=0;i< s.length();i++) {
            fout.write(ch[i]);
        }
        fout.close();

        System.out.println("File Size "+ f1.length());

        int j;
        FileInputStream fin = new FileInputStream(f1);
        do{
            j = fin.read();
            if(j!=-1){
                System.out.print((char)j);
            }
        }while(j!=-1);
        fin.close();

    }
}
