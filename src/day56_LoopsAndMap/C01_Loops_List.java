package day56_LoopsAndMap;

import java.util.ArrayList;
import java.util.List;

public class C01_Loops_List {

    public static void main(String[] args) {
        /*
        1. For, While, do while
        2. For each
        3. Iterator java 8 ile gelmiştir (lambda expression)
        4. forEach()



        String [] arr={"Burcu","Samet","Osman"};

        for ( String str: arr ) {
            System.out.println(str);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
*/



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




    }




}
