package SerializationDeserializationBasics;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;

public class SerBasics implements Serializable {
    public static void main(String[] args) {
        User user = new User();
        user.name = "Brother";
        user.password = "idontknow123#";
        try {
            FileOutputStream fileOut = new FileOutputStream("moose.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(user);

            out.close();
            fileOut.close();
            System.out.println("Object Saved to file");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
        System.out.println("Serial Version UID: "+serialVersionUID);
    }
}
//					Steps to Serialize
//					---------------------------------------------------------------
//					1. Your class should implement Serializable interface
//					2. add import java.io.Serializable;
//					3. FileOutputStream fileOut = new FileOutputStream(file path)
//					4. ObjectOutputStream out = new ObjectOutputStream(fileOut);
//					5. out.writeObject(objectName)
//					6. out.close(); fileOut.close();
//					---------------------------------------------------------------