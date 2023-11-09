package day59_JavaReview2;

import java.util.*;

public class C03_MapClasses {

    public static void main(String[] args) {

        /*
    Map (I): part of collections framework
		 does not support primitives
		 size is dynamic
		 key MUST be unique, value can be duplicated

		HashMap (C): both key and value can be null
					    the random order

		LinkedHashMap (C): both key and value can be null
						the insertion order

		TreeMap (C): key can not be null, but value can be null
					    the sorted order

		Hashtable (C): both key and value can NOT be null
					Maintains the random order
					synchronized-->Thread safe
     */

        Map<Integer,String> hashMap= new HashMap<>();
        hashMap.put(10,"Ali");
        hashMap.put(20,"Aliye");
        hashMap.put(30,"Atakan");
        hashMap.put(40,"Hatice");
        hashMap.put(50,"Burak");
        hashMap.put(50,"Samet");
        hashMap.put(null,"Samet");
        hashMap.put(null,"Ahmet");
        hashMap.put(60,null);

        System.out.println(hashMap);


        Map<Integer,String> linkedHashMap= new LinkedHashMap<>();
        linkedHashMap.put(10,"Ali");
        linkedHashMap.put(20,"Aliye");
        linkedHashMap.put(70,"Atakan");
        linkedHashMap.put(null,"Samet");
        linkedHashMap.put(null,"Ahmet");
        linkedHashMap.put(60,null);

        System.out.println(linkedHashMap);


        Map<Integer,String> treeMap= new TreeMap<>(); //key null olamaz
        treeMap.put(10,"Ali");
        treeMap.put(20,"Aliye");
        treeMap.put(30,"Atakan");
//        treeMap.put(null,"Samet");
//        treeMap.put(null,"Ahmet");
        treeMap.put(60,null);

        System.out.println(treeMap);

        Map<Integer,String> hashTable= new Hashtable<>();//key ve value ikisi de null olamaz
        hashTable.put(10,"Ali");
        hashTable.put(50,"Aliye");
        hashTable.put(5,"Atakan");
//        hashTable.put(null,"Samet");
//        hashTable.put(null,"Ahmet");
        //hashTable.put(60,null);

        System.out.println(hashTable);

    }
}
