package day52_Collections;

import java.util.*;

public class C03_List {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(5,10,15,20,25));
        System.out.println(list1);
        list1.add(5);
        System.out.println(list1);

        System.out.println("list1.get(2) = " + list1.get(2));

        List<Integer> list2 = new LinkedList<>();
        list2.addAll(Arrays.asList(5,10,15,20,25));
        list2.add(5);
        list2.add(30);
        System.out.println(list2);
        list2.remove(5);
        System.out.println(list2);
        list2.removeAll(Arrays.asList(5));
        System.out.println(list2);


        Set<Integer> set1 = new HashSet<>();
        set1.addAll(Arrays.asList(10,2,2,2,2,3,3,3,3,4,5,5,5,5,5,5,5,6,6,6,7,9,9,9));
        System.out.println("set1 = " + set1);

        List<Integer> list3 = new Vector<>();
        list3.addAll(Arrays.asList(5,10,15,20,25));
        System.out.println("list3.get(4) = " + list3.get(4));

        List<Integer> list4 = new Stack<>();
        ((Stack)list4).push(10);
        ((Stack)list4).push(11);
        ((Stack)list4).push(12);
        ((Stack)list4).push(13);
        ((Stack)list4).push(14);
        ((Stack)list4).push(15);
        System.out.println(list4);
        ((Stack)list4).pop();  //LIFO
        System.out.println(list4);
        System.out.println("((Stack)list4).peek() = " + ((Stack) list4).peek());


    }
}
