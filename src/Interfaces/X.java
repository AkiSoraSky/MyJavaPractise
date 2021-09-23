package Interfaces;

public class X extends AbstractA implements A, B, C {
    @Override
   public void foo() {
	   System.out.println("X: foo");
	   System.out.println("VAL: " + B.VAL);
   }
    //A is one of the super interfaces that X is indirectly implementing through AbstractA class
    @Override
   public void foobar() {
	   System.out.println("X: foobar");
   }
}