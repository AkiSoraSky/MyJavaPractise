package interfacesBasics;

public class Rabbit implements Flee {
    @Override
    public void flee() {
        System.out.println("**Rabbit Runs for life**");
    }
}
