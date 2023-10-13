package day40_Week08_Review;

import java.util.ArrayList;
import java.util.Arrays;

public class C05_CombineArrays2 {

    public static void main(String[] args) {

        String [] arr1= {"A","B","C"};
        String [] arr2= {"E","F","G","H"};

        ArrayList<String> arrayList= new ArrayList<>();

        for (String each : arr1) {
            arrayList.add(each);

        }
        for (String each : arr2) {
            arrayList.add(each);

        }


        System.out.println("arrayList = " + arrayList);




    }
}
