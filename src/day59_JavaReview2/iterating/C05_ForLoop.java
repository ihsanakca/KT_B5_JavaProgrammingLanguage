package day59_JavaReview2.iterating;

import java.util.*;

public class C05_ForLoop {

    public static void main(String[] args) {

        List<String> countries = Arrays.asList("Germany","UK","Australia");
        //For loop
        for (int i = 0; i < countries.size(); i++) {
            System.out.println(countries.get(i));

        }

        System.out.println("----------Enhanced Loop: List-------------------");

        for (String country: countries){
            System.out.println(country);
        }


        System.out.println("----------Enhanced Loop: Array-------------------");

        String[] countries2= {"Germany","UK","Australia"};
        for (String country: countries2){
            System.out.println(country);
        }

        System.out.println("----------Enhanced Loop: Set-------------------");

        Set<String> countries3 = new LinkedHashSet<>(Arrays.asList("Germany","UK","Australia"));
        for (String country: countries3){
            System.out.println(country);
        }

        System.out.println("----------Enhanced Loop: Map-------------------");

        Map<String, Integer> students= new LinkedHashMap<>();
        students.put("Ali",75); //entry: key-value pair
        students.put("Aliye",80);
        students.put("Mehmet",90);
        students.put("Murat",72);
        students.put("Berna",94);


        for(String eachKey: students.keySet()){
            System.out.println(eachKey);
        }

        for(Integer eachValue: students.values()){
            System.out.println(eachValue);
        }

        for(String eachKey: students.keySet()){
            System.out.println(eachKey+ " : "+ students.get(eachKey));
        }


        for(Map.Entry<String,Integer> entry: students.entrySet()){
            System.out.println(entry);
        }


    }
}
