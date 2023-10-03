package day32_Arrays_02;

import java.util.SortedMap;

public class C01_ForEachloop {

    public static void main(String[] args) {
        String [] arr=new String[4];
        arr[0]="Ahmet";
        arr[1]="Mehmet";
        arr[2]="Burcu";
        arr[3]="Atakan";

      //  String [] arr1={"Ahmet","Mehmet","Burcu","Atakan"};

        System.out.println("arr[0] = " + arr[0]);


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

        System.out.println();

        for (  String str : arr ) {
            System.out.print(str);
        }
    }
}
