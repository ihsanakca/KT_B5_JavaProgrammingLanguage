package day55_Week11_Review;

import java.util.*;

public class C01_ListObjects {

    public static void main(String[] args) {
        /*
        All of them are Lists (allows duplicates, has index, preserves insertion order)

        ArrayList: accessing/retrieving/searching elements are faster

		LinkedList: insertion & deletion of elements are faster

		Vector: Same as ArrayList but Synchronized ==> Thread-safe

		    Stack: Synchronized Is ==> Thread-safe + Last-in-first-out (LIFO) logic


         */

        //List<Character> list1= new List<>();

        List<Character> list1= new ArrayList<>();

        list1.add('a');
        list1.add('b');
        list1.add(null);
        list1.add('c');
        list1.add('c');
        list1.add('d');

        System.out.println(list1);
        System.out.println("list1.get(0) = " + list1.get(0));

        System.out.println("------------------------------------");

        List<Character> list2= new LinkedList<>();

        list2.add('a');
        list2.add('b');
        list2.add(null);
        list2.add('c');
        list2.add('c');
        list2.add('d');

        System.out.println(list2);
        System.out.println("list2.get(0) = " + list2.get(0));

        System.out.println("------------------------------------");

        List<Character> list3= new Vector<>();

        list3.add('a');
        list3.add('b');
        list3.add(null);
        list3.add('c');
        list3.add('c');
        list3.add('d');

        System.out.println(list3);
        System.out.println("list3.get(0) = " + list3.get(0));

        System.out.println("------------------------------------");

        Stack<Character> list4= new Stack<>();

        list4.push('a'); // ekliyor
        list4.push('b');
        list4.push(null);
        list4.push('c');
        list4.push('c');
        list4.push('d');


//        list4.add('a');
//        list4.add('b');
//        list4.add(null);
//        list4.add('c');
//        list4.add('c');
//        list4.add('d');
        System.out.println(list4);
        System.out.println("list4.peek() = " + list4.peek()); // gives the element at the top
        list4.pop(); //en üsttekini çıkarıyor
        System.out.println(list4);


        System.out.println(list4);
        System.out.println("list4.get(0) = " + list4.get(0));

        //((Stack)list4).pop(); //Casting



    }
}
