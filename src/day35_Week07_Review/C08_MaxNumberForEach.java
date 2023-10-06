package day35_Week07_Review;

import java.util.Arrays;

public class C08_MaxNumberForEach {

    public static void main(String[] args) {

        int[] nums= {10,5,78,96,0,5,154,1000,12};

        int max=nums[0];

        for (int each : nums) {
            if(each>max){
                max=each;
            }

        }

        System.out.println(max);

        System.out.println("-------------------");


    }
}
