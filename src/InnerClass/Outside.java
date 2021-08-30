package InnerClass;

public class Outside {
    String x = "Hello ";

    public class Inside{
        String y = "User";

        void greetings(){
            System.out.println(x+y);
        }
    }
}
