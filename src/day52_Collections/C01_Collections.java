package day52_Collections;

import java.util.*;

public class C01_Collections {
    public static void main(String[] args) {

        /*Collection nesneleri bir arada tutan yapilar
        * Karsilasilan durumlara farkli collection yapilari kullanabiliriz
        *
        * 1-List : Arraylist-Linkedlist, Vector (Stack)
        * 2-Que:   PriorityQue , ArrayQue
        * 3-Set :  Hashset,Linkedhashset, Treeset
        *
        *
        *
        * */

        int[] arr = new int[5];
        arr[0]=5;
        arr[1]=10;
        arr[2]=15;
        arr[3]=20;
        arr[4]=25;
//        arr[5]=30; //ArrayIndexOutOfBoundsException
         // No syntax Error


//        List<String> coll1 = new List<String>(); // interfaceden direk obje uretemiyoruz
        List<String> coll2= new ArrayList<>();
        List<Objects> coll3 = new LinkedList<>();
        Queue<String> coll4 = new LinkedList<>();

        Queue<Objects> coll5 = new PriorityQueue<>();
        List<String >  coll6 = new Vector<>();
        List<String >  coll7 =  new Stack<>();

        ((Stack)coll7).push("Ali");//child classin ozelligini kullacaksam casting yapmam lazim
        ((Stack)coll7).push("Veli");
        ((Stack)coll7).push("Mehmet");
        ((Stack)coll7).push("Ahmet");
        System.out.println(coll7);
        System.out.println(((Stack) coll7).pop());  //child classin ozelligini kullacaksam casting yapmam lazim
        System.out.println(coll7);

        Set<String>coll8 = new HashSet<>();
        Set<String>coll9 = new TreeSet<>();
        Set<String>coll10 = new LinkedHashSet<>();





    }
}
