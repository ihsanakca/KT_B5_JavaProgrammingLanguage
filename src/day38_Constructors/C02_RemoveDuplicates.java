package day38_Constructors;

import java.util.ArrayList;

public class C02_RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
//        System.out.println("list.size() = " + list.size());
        list.add(5);
        list.add(5);
        list.add(15);
        list.add(15);
        list.add(25);
        list.add(30);
        list.add(35);
        list.add(35);
        list.add(35);
        list.add(50);
        list.add(55);
        list.add(55);
        System.out.println(list);
        System.out.println("list.size() = " + list.size());

        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list) {
            if(result.contains(each)){
                continue;
            }
            result.add(each);
        }

        System.out.println("result = " + result);
        System.out.println("result.size() = " + result.size());


    }
}
