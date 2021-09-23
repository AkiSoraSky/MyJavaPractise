package Interfaces;

class AB implements Cloneable{
    // By implementing Cloneable interface
    // we make sure that instances of class A
    // can be cloned.
    int i;
    String s;

    // A class constructor
    public AB(int i,String s) {
            this.i = i;
            this.s = s;
        }
        // Overriding clone() method
        // by simply calling Object class
        // clone() method.
        @Override
        protected Object clone()
            throws CloneNotSupportedException {
            return super.clone();
        }
    }

    public class MarkerInterface
    {
        public static void main(String[] args) throws CloneNotSupportedException {
            AB a = new AB(20, "MarkerInterface Example");
            // cloning 'a' and holding
            // new cloned object reference in b
            // down-casting as clone() return type is Object
            AB b = (AB)a.clone();

            System.out.println(b.i);
            System.out.println(b.s);
        }
    }
