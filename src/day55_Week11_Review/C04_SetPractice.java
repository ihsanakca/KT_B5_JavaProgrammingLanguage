package day55_Week11_Review;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C04_SetPractice {

    public static void main(String[] args) {

        Set<Integer> set= new HashSet<>(); //no index
        set.add(4);
        set.add(5);
        set.add(4);
        set.add(12);
        set.add(34);
        set.add(-1);
        set.add(9);
        System.out.println("set = " + set);


        //1.Yöntem---> ArrayListe dönüştürerek

        List<Integer> list= new ArrayList<>(set);
        System.out.println("list = " + list);
        System.out.println("list.get(3) = " + list.get(3));

        System.out.println("--------------------------");

        //2.Yöntem---> Arraye dönüştürerek

        Integer[] arr= set.toArray(new Integer[0]);
        //Integer[] arr2= set.toArray(new Integer[set.size()]);
        System.out.println("arr[3] = " + arr[3]);

        //3.Yöntem
        for(int each: set){
            System.out.println(each);
        }


    }









}
