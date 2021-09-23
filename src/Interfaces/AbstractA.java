package Interfaces;

public abstract class AbstractA implements A{
    @Override
    public void bar() {
        System.out.println("AbstractA: bar");
    }
//    an abstract class implementing an interface can miss the declaration/implementation of one of the interface's methods
//    That's because if a class is abstract, then by definition you are required to create subclasses of it to instantiate.
//    The subclasses will be required (by the compiler) to implement any interface methods that the abstract class left out.
}
