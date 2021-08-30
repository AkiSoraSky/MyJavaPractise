package interfacesBasics;

public class Fish implements Hunt, Flee{
    @Override
    public void flee() {
        System.out.println("*Fish flee from larger Fishes*");
    }

    @Override
    public void hunt() {
        System.out.println("*Fish Hunts smaller Fish*");
    }
}
