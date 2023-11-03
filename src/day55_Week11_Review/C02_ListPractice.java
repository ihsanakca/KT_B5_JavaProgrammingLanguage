package day55_Week11_Review;

import java.util.*;

public class C02_ListPractice {

    public static void main(String[] args) {

        List<Integer> numList = new LinkedList<>();
        numList.addAll(Arrays.asList(5,10,15,20,15, 25,25));
        System.out.println(numList);

        numList.add(8);
        System.out.println(numList);
        Collections.sort(numList);
        System.out.println(numList);

        numList.remove(numList.size()-1);
        System.out.println(numList);

        numList.removeAll(Arrays.asList(15));
        System.out.println(numList);

        System.out.println("--------------------");

        List<Integer> numList2 = new Vector<>();
        numList2.addAll(Arrays.asList(5,10,15,20,15, 25,25));
        System.out.println(numList2);

        numList2.add(8);
        System.out.println(numList2);
        Collections.sort(numList2);
        System.out.println(numList2);

        numList2.remove(numList2.size()-1);
        System.out.println(numList2);

        numList2.removeAll(Arrays.asList(15));
        System.out.println(numList2);


        System.out.println("---------------List to Set-----------------------");

        List<Integer> list= new LinkedList<>();
        list.addAll(Arrays.asList(5,5,10,10,15,20,25,20,35,25));
        System.out.println("list = " + list);

        Set<Integer> set= new HashSet<>(list);
        System.out.println("set = " + set);

        Set<Integer> set2= new LinkedHashSet<>(list);
        System.out.println("set2 = " + set2);

    }
}
