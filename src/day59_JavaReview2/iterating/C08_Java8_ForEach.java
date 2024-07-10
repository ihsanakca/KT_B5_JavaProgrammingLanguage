package day59_JavaReview2.iterating;

import java.util.*;

public class C08_Java8_ForEach {

    public static void main(String[] args) {

        /*
Since Java 8, we can use the forEach() method to iterate over the elements of a list.
This method is defined in the Iterable interface, and can accept Lambda expressions as a parameter.

         */


        List<String> countries = Arrays.asList("Germany", "UK", "Australia");

        countries.forEach(country -> System.out.println(country));

        System.out.println("-------------------");

        Set<String> countries2 = new LinkedHashSet<>(Arrays.asList("Germany", "UK", "Australia"));

        countries2.forEach(country -> System.out.println(country));


        Map<String, Integer> students = new LinkedHashMap<>();
        students.put("Ali", 75);
        students.put("Aliye", 80);
        students.put("Hakan", 84);
        students.put("Alkan", 70);
        students.put("Başak", 90);

        students.forEach((k, v) -> System.out.println(k + " : " + v));
        students.forEach((k, v) -> System.out.println(k));
        students.forEach((k, v) -> System.out.println(v));

//        students.values().removeIf(v-> v<=75);
//        System.out.println(students);
//
//        students.keySet().removeIf(k-> k.startsWith("H"));
//        System.out.println(students);

        Set<Map.Entry<String, Integer>> entries = students.entrySet();


        Map<String, Integer> goodStudents = new LinkedHashMap<>();

        students.entrySet().forEach(entry->{
            if(entry.getValue()>=80){
                goodStudents.put(entry.getKey(), entry.getValue());
            }
            } );

        System.out.println("goodStudents = " + goodStudents);

        Map<String, Integer> goodStudents2 = new LinkedHashMap<>();

        students.forEach((key, value) -> {
            if (value >= 80) {
                goodStudents2.put(key, value);
            }
        });

        System.out.println("goodStudents2 = " + goodStudents2);


    }
}










