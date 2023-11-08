package day58_JavaReview;

import java.util.Arrays;

public class C06_ArraysReview {

    public static void main(String[] args) {


        int[] numbers = {5,10,15,20,25,30};
                       //0  1  2  3  4  5

//        int[] num;
//        num = {5,10,15,20,25,30};

        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[3]);

        for (int number : numbers) {
            int i = (int)(Math.pow(number, 2));
            System.out.println("☺*☺ = "+ i);
        }

        String[] arr1 = {"Ahmet","Rabia","Samet","Burcu"};
        String[] arr2 = {"Emre","Yusuf","Muhammed","Dincer"};

        String[][] arr2D = {arr1,arr2};

        System.out.println(Arrays.deepToString(arr2D));

        char[] hollyNameChars = "Muhammed".toCharArray();
        for (int i = 0; i < hollyNameChars.length; i++) {
            System.out.println(hollyNameChars[i]);
        }


    }
}
