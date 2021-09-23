
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

    public class Main {
        public static void main(String[] args) throws IOException
        {
            FileWriter fw= new FileWriter("list.txt");
            BufferedWriter bf=new BufferedWriter(fw);
            bf.write("Akash Pal");
            bf.close();
        }
    }
