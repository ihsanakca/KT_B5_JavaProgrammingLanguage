package day54_OOPandCollectionReview;

import java.util.*;

public class C01_CollectionReview {
    public static void main(String[] args) {
       // int n=5;

      //  int nums[]=new int[4];// --- 4 tane değişken alan depolama alanı

        Set<Integer> nums=new TreeSet<>();
        nums.add(64);
        nums.add(52);
        nums.add(21);
        nums.add(9);
        nums.add(93);
        nums.add(93);
        nums.add(9);

      //  nums.add("9");

      System.out.println(nums);



        /*
         for (Object n:nums) {
            int num=(Integer)n;
            System.out.println(n);
        }

        System.out.println(nums.get(2));
        System.out.println(nums.indexOf(9));
         */








    }
}
