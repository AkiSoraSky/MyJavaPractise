package practiseJava;

import java.util.ArrayList;

public class ArrayListTwoD {

    public static void main(String[] args) {

        ArrayList<ArrayList<String>> groceryList = new ArrayList();

        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("pizza");
        bakeryList.add("garlic bread");
        bakeryList.add("bread");

        ArrayList<String> produceList = new ArrayList();
        produceList.add("tomatoes");
        produceList.add("onion");
        produceList.add("peppers");

        ArrayList<String> drinksList = new ArrayList();
        drinksList.add("soda");
        drinksList.add("coffee");

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);

        System.out.println(groceryList);
        System.out.println(groceryList.get(0));
        System.out.println(groceryList.get(0).get(2));
    }
}
