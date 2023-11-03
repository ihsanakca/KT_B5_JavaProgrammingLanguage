package day55_Week11_Review;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class C03_SetObjects {
    public static void main(String[] args) {

        /*
                Set (I): duplicates are not allowed, does not have index number

						HashSet (C): random order. Fastest

						LinkedHashSet (C): insertion order

						TreeSet (C): natural/sorted order, does not accept null

         */

        Set<String> set1= new HashSet<>(); //random order
        set1.add(null);
        set1.add("hello world");
        set1.add("5.0");
        set1.add("#zebra");
        set1.add("hello world");
        set1.add("Java");
        System.out.println("set1 = " + set1);

        System.out.println("-----------------------------");

        Set<String> set2= new LinkedHashSet<>(); //insertion order
        set2.add(null);
        set2.add("hello world");
        set2.add("5.0");
        set2.add("#zebra");
        set2.add("hello world");
        set2.add("Java");
        System.out.println("set2 = " + set2);

        System.out.println("-----------------------------");

        Set<String> set3= new TreeSet<>(); // natural order : null kabul etmiyor
        //set3.add(null);
        set3.add("hello world");
        set3.add("5.0");
        set3.add("#zebra");
        set3.add("hello world");
        set3.add("Java");
        System.out.println("set3 = " + set3);




    }
}
