package InnerClass;

public class Main {
    /* inner class = 	A class inside of another class.
							useful if a class should be limited in scope.
							usually private, but not necessary
							helps group classes that belong together
							extremely useful for listeners for specific events
							precursor for anonymous inner classes
		*/
    public static void main(String[] args) {
        Outside os = new Outside();
        Outside.Inside in = os.new Inside();
        in.greetings();
    }
}
