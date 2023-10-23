package day46_FinalAndHiding;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        FinalExample finalExample=new FinalExample();
        System.out.println(finalExample.method(5));
      //  finalExample.X=100;


         String[] strArr={"Ahmet", "Emre", "Samet"};
        final String[] strArr2={"Ahmet", "Burcu"};
        strArr[0]="Mehmet";
        System.out.println(Arrays.toString(strArr));
        strArr=strArr2;
      //  strArr2=strArr;


        final ArrayList<Integer> arrayList=new ArrayList<>();
        ArrayList<Integer> arrayList2=new ArrayList<>();
        arrayList.add(250);
        arrayList.add(350);
        arrayList.set(0,600);// 600,350

     //   arrayList=arrayList2;
        arrayList2=arrayList;
        System.out.println(arrayList2.get(0));

        System.out.println("arrayList = " + arrayList);

    }
}
