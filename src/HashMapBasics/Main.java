package HashMapBasics;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // HashMap implements the Map interface (need import)
        // HashMap is similar to ArrayList, but with key-value pairs
        // stores objects, need to use Wrapper Class
        // ex: (name,email),(username,userID),(country,capital)
        HashMap<String, String> countries = new HashMap<String, String>();
        //adding key value pair
        countries.put("India", "New Delhi");
        countries.put("USA", "Washington DC");
        countries.put("Russia", "Moscow ");
        countries.put("China", "Beijing");

        //System.out.println(countries);
        //countries.remove("USA");
        //countries.get("Russia");
        //System.out.println(countries.get("Russia"));
        //System.out.println(countries.size());
        //countries.replace("India","Lucknow");
        //System.out.println(countries.containsKey("India"));
        //System.out.println(countries.containsValue("Russia"));
        for (String i : countries.keySet()) {
            System.out.print(i + "\t" + "= ");
            System.out.println(countries.get(i));
        }
    }
}
