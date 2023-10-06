package day35_Week07_Review;

import java.util.Arrays;

public class C02_ArrayMethods {
    public static void main(String[] args) {

        int[] num = {1, 5, 0, 78, 46};

        Arrays.sort(num);

        System.out.println(Arrays.toString(num));

        Arrays.fill(num, 0);

        System.out.println(Arrays.toString(num));

        Arrays.fill(num, 0, 2, 5);
        System.out.println(Arrays.toString(num));

        int[] copyNum = Arrays.copyOf(num, 3);

        System.out.println(Arrays.toString(copyNum));

        System.out.println(Arrays.equals(num, copyNum));

        copyNum = Arrays.copyOfRange(num, 0, 2);

        System.out.println(Arrays.toString(copyNum));

        int[] num1= {2,7,11,22,37};
        int[] num2= {2,7,11,45,37};

        int mismatchIndex = Arrays.mismatch(num1, num2);

        System.out.println("mismatchIndex = " + mismatchIndex);


    }
}
