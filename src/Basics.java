public class Basics {
    static void typeCasting() {
        System.out.println("\nInside typeCasting ...");
        // Explicit casting
        long y = 42;
        //int x = y;
        int x = (int) y;

        // Information loss due to out-of-range assignment
        byte narrowdByte = (byte) 123456;
        System.out.println("narrowdByte: " + narrowdByte);

        // Truncation
        int iTruncated = (int) 0.99;
        System.out.println("iTruncated: " + iTruncated);

        // Implicit cast (int to long)
        y = x;

        // Implicit cast (char to int)
        char cChar = 'A';
        int iInt = cChar;
        System.out.println("iInt: " + iInt);

        // byte to char using an explicit cast
        byte bByte = 65;
        cChar = (char) bByte; // special conversion (widening from byte --> int followed by narrowing from int --> char)
        System.out.println("cChar: " + cChar);
    }

    static void arrays() {
        System.out.println("\nInside arrays ...");
        int[] myArray = new int[]{9, 11, 2, 5, 4, 4, 6};
        System.out.println("myArray.length: " + myArray.length);
        System.out.println("myArray[1]: " + myArray[1]);
    }

    static void varargsOverload(boolean b, int i, int j, int k) {
        System.out.println("\nInside varargsOverload without varargs ...");
    }

    static void varargsOverload(boolean b, int... list) {
        System.out.println("\nInside varargsOverload with varargs ...");
        System.out.println("list.length: " + list.length);
    }

    static void charTypePromotion() {
        System.out.println("\nInside charTypePromotion ...");
        char char1 = 50; // Will be assigned corresponding UTF16 value 2
        System.out.println("char1: " + char1);
        System.out.println("(73 - char1): " + (73 - char1)); // char1 gets promoted to int, i.e., decimal equivalent 50 in UTF16 is used
        System.out.println("(char1 - '3'): " + (char1 - '3')); // char1 & '3' are promoted to ints
        System.out.println("('a' + 'b'): " + ('a' + 'b')); // 'a' & 'b' are promoted to ints and the respective equivalents 97 & 98 are added
    }

    static void bitwiseOperators() {
        System.out.println("\nInside bitwiseOperators ...");
        int x = 1;
        int y = 3;

        System.out.println("x & y: " + (x & y));
        System.out.println("x | y: " + (x | y));
        System.out.println("x ^ y: " + (x ^ y));
        System.out.println("~x: " + (~x));
        System.out.println("true & false: " + (true & false));

        char c1 = 'a'; // U+0061 --> 0110 0001
        char c2 = 'b'; // U+0062 --> 0110 0010
        System.out.println("c1 | c2: " + (c1 | c2)); // 0110 0011 --> 99 in decimal

        // bitwise work only on Integer types, others will not compile
    }

    static void switchExample() {
        System.out.println("\nInside switchExample ...");
        int month = 3;
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            default:
                System.out.println("April");
        }
    }

    static void labeledBreak() {     //usually break is used only for switch n while loop
        System.out.println("\nInside labeledBreak ...");
        int num = 0;

        outermost:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 5 && j == 5) {
                    break outermost;
                }
                num++;
            }
        }

        System.out.println("num: " + num); // prints 55
    }

    static void labeledContinue() {
        System.out.println("\nInside labeledContinue ...");
        int num = 0;

        outermost:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 5 && j == 5) {
                    continue outermost;
                }
                num++;
            }
        }

        System.out.println("num: " + num); // prints 55
    }

    static void stringExamples() {
        System.out.println("\nInside stringExamples ...");
        String s = "hello world!";
        String q = " Good,Bye,World  ";
        System.out.println("s: " + s);

        System.out.println("\ns.length(): " + s.length());
        System.out.println("s.isEmpty(): " + s.isEmpty());

        // Comparison ( .equals/.equalsIgnoreCase/.compareTo)
        System.out.println("\ns.equals(\"HELLO WORLD!\"): " + s.equals("HELLO WORLD!"));
        System.out.println("s.equalsIgnoreCase(\"HELLO WORLD!\"): " + s.equalsIgnoreCase("HELLO WORLD!"));
        System.out.println("s.equalsIgnoreCase(\"To The 'q'!\"): " + s.equalsIgnoreCase(q));
        System.out.println("s.compareTo(\"HELLO WORLD!\"): " + s.compareTo("HELLO WORLD!"));

        // Searching (.contains,.startsWith, .endsWith, .indexOf, .lastIndexOf)
        System.out.println("\ns.contains(\"HELLO WORLD!\"): " + s.contains("HELLO WORLD!"));
        System.out.println("s.contains(\"world!\"): " + s.contains("world!"));
        System.out.println("s.startsWith(\"HELLO WORLD!\"): " + s.startsWith("HELLO WORLD!"));
        System.out.println("s.startsWith(\"hello world!\"): " + s.startsWith("hello"));
        System.out.println("s.endsWith(\"!\"): " + s.endsWith("!"));
        System.out.println("s.indexOf(\"lo\"): " + s.indexOf("lo")); //Returns the index within this string of the first
        // occurrence of the specified substring.
        System.out.println("s.indexOf(\"o\"): " + s.indexOf('o'));
        System.out.println("s.lastIndexOf(\"o\"): " + s.lastIndexOf('o')); //tells last index of a String char

        // Examining individual characters
        System.out.println("\ns.charAt(4): " + s.charAt(4));

        // Extracting substrings
        System.out.println("\ns.substring(4): " + s.substring(4));
        System.out.println("s.substring(4, 9): " + s.substring(4, 9));
        //Returns a string that is a substring of this string.
        // The substring begins with the character at the specified index and extends to the end of this string.
        //Examples:
        //       "unhappy".substring(2) returns "happy"
        //       "Harbison".substring(3) returns "bison"
        //       "emptiness".substring(9) returns "" (an empty string)
        //Params: beginIndex – the beginning index, inclusive.
        //Returns: the specified substring.

        // Case conversions (Note: String is immutable. So, only a copy is returned)
        System.out.println("\ns.toUpperCase(): " + s.toUpperCase());
        System.out.println("s.toLowerCase(): " + s.toLowerCase());

        System.out.println("\nwithout trim(): " + q); // returns a copy of string after trimming any leading & trailing white spaces
        System.out.println("\nwith    trim(): " + q.trim()); // returns a copy of string after trimming any leading & trailing white spaces


        // Replace (e.g., replace comma's with white-space)
        System.out.println("\ns.replaceAll(\"o\", \"r\"): " + s.replaceAll("o", "r"));

        // Split (e.g., split a document into words or split a line of text by tab or comma or white space)
        System.out.println("\nq.split(\",\"): "); //creates array of string divided by the value given
        String[] sa = q.split(",");
        for (String temp : sa) {
            System.out.println(temp);
        }
        System.out.println(sa[1]);
    }
    // Static method (includes overloaded methods)
    //System.out.println("\nString.valueOf(1.3): " + String.valueOf(1.3));

    public static void main(String[] args) {
        typeCasting();
        arrays();
        varargsOverload(true, 1, 2, 3);
        varargsOverload(true, 1, 2, 3, 4, 5, 6, 7, 8);
        varargsOverload(true); //no list provided
        charTypePromotion();
        bitwiseOperators();
        switchExample();
        labeledBreak();
        labeledContinue();
        stringExamples();
    }
}

