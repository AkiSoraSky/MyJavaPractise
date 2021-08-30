package polymorphismBasics;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Bicycle bi = new Bicycle();
        Boat boat = new Boat();

        Vehicle[] avail = {car,bi,boat};

        for(Vehicle x: avail){
            x.go();
        }
    }
}
