package day59_JavaReview2.iterating;

import java.util.*;

public class C06_Iterator {

    public static void main(String[] args) {

        String[] countries2 = {"Germany", "UK", "Australia"};

        //Iterator<String > iterator= countries2.iterator();

        List<String> countries = Arrays.asList("Germany", "UK", "Australia");

        Iterator<String> iterator = countries.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }

        System.out.println("----------------SET-----------------------");
        Set<String> countries3 = new LinkedHashSet<>(Arrays.asList("Germany", "UK", "Australia"));

        Iterator<String> iterator3 = countries3.iterator();

        while (iterator3.hasNext()) {
            System.out.println(iterator3.next());
        }

        System.out.println("----------------MAP-----------------------");

        Map<String, Integer> students= new LinkedHashMap<>();
        students.put("Ali",75);
        students.put("Aliye",80);

        Iterator<String> studentsIterator = students.keySet().iterator();
        while (studentsIterator.hasNext()) {
            System.out.println(studentsIterator.next());
        }

        Iterator<Integer> studentsIterator2 = students.values().iterator();
        while (studentsIterator2.hasNext()) {
            System.out.println(studentsIterator2.next());
        }

        Iterator<Map.Entry<String,Integer>> studentsIterator3 = students.entrySet().iterator();
        while (studentsIterator3.hasNext()) {
            System.out.println(studentsIterator3.next());
        }



    }
}
