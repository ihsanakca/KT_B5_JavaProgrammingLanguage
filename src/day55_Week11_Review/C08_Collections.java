package day55_Week11_Review;

import java.util.*;

public class C08_Collections {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("hello", "world", "java", "ruby"));

        Collections.sort(list);
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);

        List<Integer> nums = new ArrayList<>(Arrays.asList(3, 4, 154, 0, 2, 4, 2, 7, 2));

        System.out.println("Collections.max(nums) = " + Collections.max(nums));


        Collections.sort(nums);

        System.out.println("nums = " + nums);

        Collections.sort(nums, Collections.reverseOrder());

        System.out.println("nums = " + nums);

        Set<Integer> set = new HashSet<>(); //no index
        set.add(4);
        set.add(5);
        set.add(4);
        set.add(12);
        set.add(34);
        set.add(-1);
        set.add(9);
        System.out.println("set = " + set);

        System.out.println("Collections.max(set) = " + Collections.max(set));

        System.out.println("Collections.min(set) = " + Collections.min(set));

        System.out.println("Collections.frequency(nums,2) = " + Collections.frequency(nums, 2));


    }
}
