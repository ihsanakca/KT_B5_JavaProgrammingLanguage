package day40_Week08_Review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.Callable;

public class C06_MaxNumber {

    public static void main(String[] args) {

        ArrayList<Integer> numList= new ArrayList<>();

        numList.addAll(Arrays.asList(1,5,89,456,12,3,0,77));

        System.out.println(numList);

        //2nd solution

        Integer max = Collections.max(numList);

        System.out.println(max);

        Collections.sort(numList);
        System.out.println(numList);
        System.out.println(numList.get(numList.size() - 1));





    }
}
