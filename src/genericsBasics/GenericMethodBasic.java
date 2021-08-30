package genericsBasics;

public class GenericMethodBasic {
    public <Items> void printItems(Items[] s){
        for(Items x: s){
            System.out.print(x+" \t");
        }
    }

    // Generic method with generic return type
    public static <Thing> Thing firstIndex(Thing[] array) {
        return array[0];
    }

    public static void main(String args[]) {
        GenericMethodBasic item = new GenericMethodBasic();

        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {5.5, 4.4, 3.3, 2.2, 1.1};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
        String[] stringArray = {"B", "Y", "E"};

        System.out.println("Integer: ");
        item.printItems(intArray);
        System.out.println(firstIndex(intArray));

        System.out.println("\n\nDouble: ");
        item.printItems(doubleArray);
        System.out.println(firstIndex(doubleArray));

        System.out.println("\n\nCharacter: ");
        item.printItems(charArray);
        System.out.println(firstIndex(charArray));

        System.out.println("\n\nString: ");
        item.printItems(stringArray);
        System.out.println(firstIndex(stringArray));
    }
}
