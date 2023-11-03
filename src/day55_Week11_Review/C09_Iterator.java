package day55_Week11_Review;

import java.util.*;

public class C09_Iterator {

    public static void main(String[] args) {


        List<String> names= new ArrayList<>(Arrays.asList("Ali","Veli","Deli","Remzi"));

        System.out.println(names);

        for (String each : names) {
            System.out.println(each);

        }

        System.out.println("--------------------------------");


        Iterator<String> iterator= names.iterator();
//        System.out.println("iterator.hasNext() = " + iterator.hasNext());
//
//        System.out.println("iterator.next() = " + iterator.next());
//        System.out.println("iterator.next() = " + iterator.next());
//        System.out.println("iterator.next() = " + iterator.next());
//        System.out.println("iterator.hasNext() = " + iterator.hasNext());
//        //System.out.println("iterator.next() = " + iterator.next());



        System.out.println("-------------------------------------");

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Set<String> words= new HashSet<>(Arrays.asList("one","two","three","four"));

        Iterator<String>  iterator1 = words.iterator();


        while (iterator1.hasNext()){
            if(iterator1.next().length()<=4){
                iterator1.remove();
            }
        }

        System.out.println(words);

        List<String> words2= new ArrayList<>(Arrays.asList("one","two","three","four","one","two"));

        Iterator<String> it= words2.iterator();

        while (it.hasNext()){
            if(it.next().equals("two")){
                it.remove();
            }
        }
        System.out.println("words2 = " + words2);


    }
}
