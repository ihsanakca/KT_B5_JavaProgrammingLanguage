package day53_Collections2;

import java.util.*;

public class C03_SetPractice {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(20, 300, 40, 5, 60, 75, 70, 15, 100, 15, 100, 20, null));
        list.addAll(Arrays.asList(20, 300, 40, 5, 60, 75, 70, 15, 100, 15, 100, 20, null));
        list.addAll(Arrays.asList(20, 300, 40, 5, 60, 75, 70, 15, 100, 15, 100, 20, null));
        list.addAll(Arrays.asList(20, 300, 40, 5, 60, 75, 70, 15, 100, 15, 100, 20, null));
        System.out.println("list = " + list);
        list.get(5);

        System.out.println("----------------------------");

        Set<Integer> hashSet = new HashSet<>();
        hashSet.addAll(Arrays.asList(20, 300, 40, 5, 60, 75, 70, 15, 100, 15, 100, 20, null));
        hashSet.addAll(Arrays.asList(20, 300, 40, 5, 60, 75, 70, 15, 100, 15, 100, 20, null));
        hashSet.addAll(Arrays.asList(20, 300, 40, 5, 60, 75, 70, 15, 100, 15, 100, 20, null));
        hashSet.addAll(Arrays.asList(20, 300, 40, 5, 60, 75, 70, 15, 100, 15, 100, 20, null));
        System.out.println("hashSet = " + hashSet);
//        hashSet.get(3);

        Set<Integer> linkedHashSet = new LinkedHashSet<>();  // insertion order preserved
        linkedHashSet.addAll(Arrays.asList(20, 300, 40, 5, 60, 75, 70, 15, 100, 15, 100, 20, null));
        linkedHashSet.addAll(Arrays.asList(20, 300, 40, 5, 60, 75, 70, 15, 100, 15, 100, 20, null));
        linkedHashSet.addAll(Arrays.asList(20, 300, 40, 5, 60, 75, 70, 15, 100, 15, 100, 20, null));
        linkedHashSet.addAll(Arrays.asList(20, 300, 40, 5, 60, 75, 70, 15, 100, 15, 100, 20, null));
        System.out.println("linkedHashSet = " + linkedHashSet);
//        linkedHashSet.get(5)

        Set<Integer> treeSet = new TreeSet<>(); //sort null
        treeSet.addAll(Arrays.asList(20, 300, 40, 5, 60, 75, 70, 15, 100, 15, 100, 20));
        treeSet.addAll(Arrays.asList(20, 300, 40, 5, 60, 75, 70, 15, 100, 15, 100, 20));
        treeSet.addAll(Arrays.asList(20, 300, 40, 5, 60, 75, 70, 15, 100, 15, 100, 20));
        treeSet.addAll(Arrays.asList(20, 300, 40, 5, 60, 75, 70, 15, 100, 15, 100, 20));
//        treeSet.addAll(Arrays.asList(null,null,null));
        System.out.println("treeSet = " + treeSet);
//        treeSet.get(5);

//        String str =null;
//        str.charAt(5);


    }

}
