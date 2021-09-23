package collectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetvsHashSet {
    private static void linkedHashSet() {
        Set<String> hashset = new HashSet<>();
        hashset.add("Akash");
        hashset.add("Ashwani");
        hashset.add("Amar");

        System.out.println("HashSet: "+hashset);

        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Akash");
        linkedHashSet.add("Ashwani");
        linkedHashSet.add("Amar");

        System.out.println("LinkedHashSet: "+linkedHashSet);
    }

    public static void main(String[] args) {
        linkedHashSet();
    }
}
