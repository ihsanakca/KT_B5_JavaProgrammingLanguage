package day35_Week07_Review;

import java.util.Arrays;

public class C04_Numbers1to100 {

    public static void main(String[] args) {

        int[] numbers= new int[100];

//        numbers[0]=1;
//        numbers[1]=2;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=i+1;
        }
        System.out.println(Arrays.toString(numbers));

    }
}
