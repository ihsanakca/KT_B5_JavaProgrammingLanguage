package day59_JavaReview2;

import java.util.Arrays;

public class C01_Arrays {

    public static void main(String[] args) {

        /*
        Hold multiple values of the same data type
        Every Element has index numbers

        * Size is fixed
        * Hold both primitive types and object types
        * Have a default value for the elements when defined

        Arrays Utility: Utility class of the array, provides the methods that can be used for the arrays
			class name: Arrays
			package: java.util

		toString(array): converts array to string
         */

        int[] n1= {1,2,3};
        int[] n2= new int[3];
        int[] n3= new int[]{10,9,8};

        n2[0]=1;
        n2[1]=3;
        n2[2]=5;
        //n2[3]=7;

        System.out.println(n2);
        System.out.println(Arrays.toString(n2));

        int[] z= new int[1];
        int y[]= new int[1]; // geçerli ama tercih edilmiyor

        //n1.length=4;

        System.out.println(Arrays.toString(new int[3]));

        int[] num2= {4,7,48};
        num2[1]=41;
        System.out.println(Arrays.toString(num2));
        System.out.println("num2[1] = " + num2[1]);


    }


}
