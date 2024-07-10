package day56_LoopsAndMap;

import java.util.*;
import java.util.stream.Stream;

public class C01_Loops_List {

    public static void main(String[] args) {
        /*
        1. For, While, do while
        2. For each
        3. Iterator java 8 ile gelmiştir (lambda expression)
        4. forEach()


*/
        String [] arr={"Burcu","Samet","Osman"};

        for ( String str: arr ) {
            System.out.println(str);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

//        boolean bl = Arrays.stream(arr).anyMatch(e->e.equals("Osman"));
//        System.out.println("bl = " + bl);
//
//        Stream<String> filter = Arrays.stream(arr).filter(e -> e.equals("Osman"));
//        System.out.println("**");
//        filter.forEach(System.out::println);


        List<Integer> list=new ArrayList<>();
        list.add(25);
        list.add(35);
        list.add(6);
        list.add(16);

        for ( Integer sayi: list) {
            System.out.println(sayi+" ");
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)+" ");
        }


        System.out.println("---------------------");
        System.out.println("---------------------");

        // 25 den küçük olan sayıları sil ve listi ekrana yazdır

    /*

        for ( Integer sayi: list) {
            if (sayi<25){
               list.remove(sayi);
            }
        }
        System.out.println(list);


        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)<25){
                list.remove(i);
                i--;
            }
        }

        System.out.println(list);
        */

        //palindrome olanları sil..sorusu..


        Set<String> set = new HashSet<>();
        set.add("21");
        set.add("100");
        set.add("10");
        set.add("108");
        set.add("1512");

        for (String s : set) {
            System.out.println("s = " + s);
        }


    }




}
