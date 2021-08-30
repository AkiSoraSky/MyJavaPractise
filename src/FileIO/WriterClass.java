package FileIO;

import java.io.FileWriter;
import java.io.IOException;

public class WriterClass {

    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("Roses are red \nViolets are blue \nCovid is Everywhere \nWhere are you!");
            writer.append("\n(A poem by Me)");
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
