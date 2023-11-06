package day56_LoopsAndMap;

import java.util.HashSet;
import java.util.Set;

public class C02_Loops_Set {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.add(25);
        set.add(35);
        set.add(6);
        set.add(16);

/*
        for ( Integer sayi: set) {
            System.out.println(sayi+" ");
        }
*

 */
// set içerisinden 25 den küçük sayıları silin ve ekrana yazdırın

        Set<Integer> set1=new HashSet<>();

        for (Integer sayi: set) {
            if (sayi>=25){
                set1.add(sayi);
            }
        }
        System.out.println(set1);


    }
}
