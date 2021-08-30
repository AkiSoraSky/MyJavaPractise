package polymorphismBasics;

public class Car extends Vehicle{
    @Override
    public void go() {
        super.go();
        System.out.println("The Car begin Moving");
    }
}
