package day40_Week08_Review;

import java.util.ArrayList;
import java.util.Arrays;

public class C07_Swap {

    public static void main(String[] args) {

        ArrayList<Integer> nums= new ArrayList<>(Arrays.asList(1,2,3,4,5));  // --> (5,2,3,4,1)


        int temp = nums.get(0);

        nums.set(0,nums.get(nums.size()-1));

        nums.set((nums.size()-1),temp);


        System.out.println(nums);


    }
}
