package collectionFramework;

import java.util.ArrayDeque;
import java.util.Deque;

public class QueueEx1 {
    private static void dequeTest() {
        Deque<String> deque = new ArrayDeque<>();
        deque.add("walden");
        deque.add("harry potter");
        deque.add("Head First Java");
        deque.add("Ni pta");

        System.out.println("Printing Deque: ");
        System.out.println(deque.remove());
        System.out.println(deque.remove());
        System.out.println(deque.remove());
        System.out.println(deque.remove());
// Stack
        System.out.println("=====================================");
        System.out.println("Printing Stack");
        deque.push("walden");
        deque.push("harry potter");
        deque.push("Head First Java");
        deque.push("Ni pta");

        System.out.println(deque.pop());
        System.out.println(deque.pop());
        System.out.println(deque.pop());
        System.out.println(deque.pop());
    }

    public static void main(String[] args) {
        dequeTest();
    }
}
