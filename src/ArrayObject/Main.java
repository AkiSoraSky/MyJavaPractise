package ArrayObject;

public class Main {
    public static void main(String[] args) {
        //Food[] fridge = new Food[3];

        Food food1 = new Food("grapes");
        Food food2 = new Food("Icecream");
        Food food3 = new Food("cake");

//        fridge[0] = food1;
//        fridge[1] = food2;
//        fridge[2] = food3;

        Food[] fridge = {food1, food2, food3};

        System.out.println("Inside Fridge");
        for (Food food : fridge) {
            System.out.println("-" + food.name);
        }
    }
}
