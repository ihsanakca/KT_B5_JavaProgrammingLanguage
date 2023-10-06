package day35_Week07_Review;

import java.util.Arrays;

public class C01_ArrayIntro {

    public static void main(String[] args) {


        int[] nums;

        int scores[];

        int[] numbers = new int[4];

        System.out.println("numbers = " + numbers);

        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));

        String[] str = new String[3];

        str[0] = "Ali";
        str[1] = "Veli";

        double[] doubleNum = new double[2];

        boolean[] bool = new boolean[1];

        System.out.println("Arrays.toString(str) = " + Arrays.toString(str));
        System.out.println("Arrays.toString(doubleNum) = " + Arrays.toString(doubleNum));

        System.out.println("Arrays.toString(bool) = " + Arrays.toString(bool));

        char[] chars = new char[2];

        System.out.println("Arrays.toString(chars) = " + Arrays.toString(chars));

        float[] floatNum = new float[0];
        System.out.println("Arrays.toString(floatNum) = " + Arrays.toString(floatNum));

        int[] myNumbers = {5, 7, 9, 15};
        System.out.println(myNumbers.length);

        int[] age= {12, 45 ,36};



    }
}
