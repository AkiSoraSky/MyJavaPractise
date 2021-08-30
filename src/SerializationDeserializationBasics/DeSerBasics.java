package SerializationDeserializationBasics;

import java.io.*;

public class DeSerBasics implements Serializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User use = null;

        FileInputStream fileIn = new FileInputStream("moose.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        use = (User) in.readObject();
        in.close();
        fileIn.close();

        long serialVersionID = ObjectStreamClass.lookup(use.getClass()).getSerialVersionUID();
        System.out.println("user: "+use.name);
        System.out.println("password: "+use.password);
        System.out.println("SerialVersionID: "+serialVersionID);
    }
}

//					Steps to Deserialize
//					---------------------------------------------------------------
//					1. Your class should implement Serializable interface
//					2. add import java.io.Serializable; //object should be null;
//					3. FileInputStream fileIn = new FileInputStream(file path);
//					4. ObjectInputStream in = new ObjectInputStream(fileIn);
//					5. objectNam = (Class) in.readObject();
//					6. in.close(); fileIn.close();
//					---------------------------------------------------------------