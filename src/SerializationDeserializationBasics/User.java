package SerializationDeserializationBasics;

import java.io.Serializable;

public class User implements Serializable {
    String name;
    String password;

    //private static final long serialVersionUID = 123;  -> to set serial versionId of your own
	//transient String password; //transient values are ignored

    void greeting(){
        System.out.println("Welcome: "+name);
    }
}
//Serialization = 	The process of converting state of an object into a byte stream.
//					Persists (saves the state) the object after program exits
//					This byte stream can be saved as a file or sent over a network
//					Byte stream can be saved as a file (.ser) which is platform independent
//					(Think of this as if you're saving a file with the object's information)
