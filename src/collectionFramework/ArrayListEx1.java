package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx1 {

    private static List<Integer> myListOne() {
        List<Integer> list1 = new ArrayList<>();
        //add and remove
        list1.add(6);
        list1.add(1);
        list1.add(3);
        list1.add(5);
        list1.add(5);
        list1.add(null);
        list1.add(9);
        System.out.println("List: " + list1);

        list1.remove(5);
        System.out.println("List Remove: " + list1);
//        list1.remove(4);
//        System.out.println("List: " + list1);
        list1.add(1,45);
        System.out.println("List Add by Index: " + list1);
        list1.set(2,44);
        System.out.println("List set value: " + list1);
        System.out.println("Size of arrayList: "+list1.size());

        List<Integer> list2 = new ArrayList<>();
        list2.add(5);
        list2.add(45);
        System.out.println("Removing all: " +list1.removeAll(list2)); //removed all element common in list1 n list2
        System.out.println("Removing all: " +list1);

        list2.add(6);
        System.out.println("Retain Removing all: " +list1.retainAll(list2)); //removed all element except common(retained element) in list1 n list2
        System.out.println("Remaining: " +list1);

        list1.addAll(list2);
        System.out.println("Adding All: "+list1);

        //Search
        System.out.println("List Contains: " +list1.contains(5));
        System.out.println("List IndexOf: " +list1.indexOf(5));
        System.out.println("List Last Index Of: " +list1.lastIndexOf(6));
        System.out.println("List Contains: " +list1.contains(44));

        //Range view
        System.out.println(list1.subList(1,3));

        //Adding in substring to get result in main List1
        List<Integer> list3 = list1.subList(1,3);
        list3.add(2);
        list3.add(5); //[6, 5, 45, 6] -> [6, 5, 45, 2, 5, 6]
        System.out.println(list1);
        //list1.add(0,5);
        //System.out.println(list3); //'java.util.ConcurrentModificationException'

//        for(int element: list1) {
//            System.out.println("element: "+element);
//        }
        return list1;
    }
    private static void iteratorEx(List<Integer> list1){
        Iterator<Integer> iterator = list1.iterator();
        while (iterator.hasNext()) {
            int element = iterator.next();
            System.out.println("element: " + element);
            if (element == 6) {
                iterator.remove();
            }
        }
            System.out.println(list1);
        }

    public static void main(String[] args) {
        List<Integer> list1 = myListOne();
        iteratorEx(list1);
    }
}
