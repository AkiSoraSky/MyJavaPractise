package extraJava;

import java.util.ArrayList;

public class ArrayListPrac {
    public static void main(String[] args) {

            // ArrayList = 	a resizable array.
            //				Elements can be added and removed after compilation phase
            //				store reference data types --> WrapperClass
            //              we use .size in arrayList (instead of .length used in array)

            ArrayList<String> food = new ArrayList<String>();

            food.add("pizza");
            food.add("hamburger");
            food.add("hotdog");

            //food.set(0, "sushi"); // replacing value in arraylist using .set
            //food.remove(2); //remove value in arraylist using .remove
            //food.clear();

            for(int i=0; i<food.size(); i++) {
                System.out.println(food.get(i));
            }
    }
}
