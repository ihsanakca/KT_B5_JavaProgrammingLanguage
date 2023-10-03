package day32_Arrays_02;

import java.util.Arrays;

public class C03_ArraysToString {

    public static void main(String[] args) {
        String [] arr=new String[4];
        arr[0]="Ahmet";
        arr[1]="Mehmet";
        arr[2]="Burcu";
        arr[3]="Atakan";

        String string = Arrays.toString(arr);
        System.out.println("string = " + string);

        System.out.println("toString(arr) = " + toString(arr));


        int [] arr1;
        arr1=new int[5];
        arr1[0]=23;
        arr1[1]=34;
        arr1[2]=54;
        arr1[3]=27;
        arr1[4]=89;


        System.out.println("toString(arr1) = " + toString(arr1));

    }




    public static String toString(String [] array){
         String result="[";
        for (int i = 0; i < array.length; i++) {
            if (i== array.length-1){
                result+=array[i]+"]";
            }else {
                result += array[i] + ", ";
            }
        }
        return result;
    }



    public static String toString(int [] array){
        String result="[";
        for (int i = 0; i < array.length; i++) {
            if (i== array.length-1){
                result+=array[i]+"]";
            }else {
                result += array[i] + ", ";
            }
        }
        return result;
    }




    public static String toString(double [] array){
        String result="[";
        for (int i = 0; i < array.length; i++) {
            if (i== array.length-1){
                result+=array[i]+"]";
            }else {
                result += array[i] + ", ";
            }
        }
        return result;
    }

}
