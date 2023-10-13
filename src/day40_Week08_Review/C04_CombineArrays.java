package day40_Week08_Review;

import java.util.ArrayList;
import java.util.Arrays;

public class C04_CombineArrays {

    public static void main(String[] args) {

        String [] arr1= {"A","B","C"};
        String [] arr2= {"E","F","G","H"};

        ArrayList<String> arrayList= new ArrayList<>();

        arrayList.addAll(Arrays.asList(arr1));
        arrayList.addAll(Arrays.asList(arr2));
        System.out.println("arrayList = " + arrayList);




    }
}
