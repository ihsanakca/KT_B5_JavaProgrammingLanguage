package day53_Collections2;

import java.util.*;

public class C05_SetPractice3 {
    public static void main(String[] args) {
        String[] arr = {"Book","Notebook","Food","PencilCase","Book","Book","Book"
                ,"Pen","Spoon","Mirror","Spoon","WaterBottle","Phone","Phone"};
        System.out.println("arr.length = " + arr.length);


        Set<String> uniqueItemInMyBag = new HashSet<>(Arrays.asList(arr));
        System.out.println("uniqueItemInMyBag = " + uniqueItemInMyBag);
        System.out.println("uniqueItemInMyBag.size() = " + uniqueItemInMyBag.size());

        Set<String> uniqueItemInMyBag2 = new LinkedHashSet<>(Arrays.asList(arr));
        System.out.println("uniqueItemInMyBag2 = " + uniqueItemInMyBag2);
        System.out.println("uniqueItemInMyBag2.size() = " + uniqueItemInMyBag2.size());

        Set<String> uniqueItemInMyBag3 = new TreeSet<>(Arrays.asList(arr));
        System.out.println("uniqueItemInMyBag3 = " + uniqueItemInMyBag3);
        System.out.println("uniqueItemInMyBag3.size() = " + uniqueItemInMyBag3.size());


    }
}
