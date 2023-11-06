package day56_LoopsAndMap;

import java.util.*;

public class C03_Iterator {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.add(25);
        set.add(35);
        set.add(6);
        set.add(16);
        System.out.println(set);


        // set içerisinden 25 den küçük sayıları silin ve ekrana yazdırın

        Iterator<Integer> iterator= set.iterator();

        System.out.println(iterator.hasNext());
/*
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
    //    System.out.println(iterator.next());

        System.out.println(iterator.hasNext());
*

 */

        while (iterator.hasNext()){
            Integer sayi = iterator.next();
            if (sayi<25){
                iterator.remove();
            }

        }
        System.out.println(set);


        //forEach ();   method



        List<String> list= Arrays.asList("Ahmet", "Osman", "Muhammed");

        for ( String str :list ) {
            System.out.println(str);
        }

        list.forEach(x-> System.out.println(x));
        set.forEach(y-> System.out.println(y));


    List<Integer> list1=new ArrayList<>();
    set.forEach(y-> list1.add(y));
        System.out.println("list1 = " + list1);


    }

        }

