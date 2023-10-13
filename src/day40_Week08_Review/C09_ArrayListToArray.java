package day40_Week08_Review;

import java.util.ArrayList;
import java.util.Arrays;

public class C09_ArrayListToArray {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList= new ArrayList<>();
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(15);

        System.out.println(arrayList);

        //convert ArrayList to Array
        Integer[] array = arrayList.toArray(new Integer[0]);

        System.out.println(Arrays.toString(array));

        System.out.println(array.getClass());

        System.out.println("--------------------");
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Java");
        arrayList1.add("JavaScript");
        arrayList1.add("C++");

        System.out.println(arrayList1.getClass());

        String[] array1 = arrayList1.toArray(new String[0]);

        System.out.println(Arrays.toString(array1));

        System.out.println(array1.getClass());


    }
}
