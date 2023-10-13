package day40_Week08_Review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class C10_ArrayToArrayList {

    public static void main(String[] args) {

        String [] names= {"Ali","Veli"};

        //1. yontem: Arrays.asList()
        ArrayList<String> namesList= new ArrayList<>(Arrays.asList(names));

        System.out.println(namesList);

        //2.yontem: Collections.addAll()
        String [] names2= {"Ali","Veli"};
        ArrayList<String> namesList2= new ArrayList<>();
        Collections.addAll(namesList2,names2);
        System.out.println(namesList2);

        //3.yontem: for each loop
        String [] names3= {"Ali","Veli"};
        ArrayList<String> namesList3= new ArrayList<>();
        for (String each : names3) {
            namesList3.add(each);
        }
        System.out.println(namesList3);

        System.out.println("------------------");

        //int [] nums= {1,3,5};
        Integer [] nums= {1,3,5};

        ArrayList<Integer> numsList= new ArrayList<>(Arrays.asList(nums));
        System.out.println(numsList);

        ArrayList<Integer> numsList2= new ArrayList<>(Arrays.asList(1,3,5));
        System.out.println(numsList2);
    }
}
