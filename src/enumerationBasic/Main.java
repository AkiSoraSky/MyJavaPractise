package enumerationBasic;

public class Main {
    static void canILiveHere(Planet myPlanet){

        if (myPlanet == Planet.EARTH) {
            System.out.println("You can live here :)");
            System.out.println("This is planet #" + myPlanet.number);
        } else {
            System.out.println("You can't live here...yet");
            System.out.println("This is planet #" + myPlanet.number);
        }
    }
    public static void main(String[] args) {

        //enum = enumerated (ordered listing of items in a collection)
        //grouping of constants that behave similarly to objects

        Planet myPlanet = Planet.PLUTO;

        canILiveHere(myPlanet);
    }
}
