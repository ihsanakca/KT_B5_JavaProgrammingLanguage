package day38_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class C03_BulkOperations {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(5);
        list.add(15);
        list.add(15);
        list.add(25);
        list.add(30);
        list.add(35);
        list.add(35);
        list.add(35);
        list.add(50);
        list.add(55);
        list.add(55);

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.addAll(list);

        System.out.println("list1 = " + list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 3, 3, 3, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1));
        System.out.println("list2 = " + list2);

        System.out.println("----------------------------------------------------");
        list2.removeAll(Arrays.asList(1,2,3));
        System.out.println("list2 = " + list2);

        list2.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 3, 3, 3, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1));
        System.out.println("list2 = " + list2);

        list2.retainAll(Arrays.asList(1,2,3));
        System.out.println("list2 = " + list2);

        System.out.println("list2.containsAll(Arrays.asList(1,2,3,4)) = " + list2.containsAll(Arrays.asList(1, 2, 3, 4)));
        System.out.println("list2.containsAll(Arrays.asList(1,2)) = " + list2.containsAll(Arrays.asList(1, 2)));

        System.out.println("----------------------------------------------------");

        ArrayList<String> jobTitles = new ArrayList<>();

        jobTitles.addAll(Arrays.asList("QA","QA Engineer", "SDET", "Software Engineer In Test"
                ,"Automation Engineer", "Software Tester","QA Automation Engineer"));
        System.out.println("jobTitles = " + jobTitles);

    }
}
