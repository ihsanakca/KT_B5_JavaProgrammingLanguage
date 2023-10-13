package day40_Week08_Review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class C08_ReverseArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));

        //System.out.println(list);

        //1.yontem

        //Collections.reverse(list);
        //System.out.println(list);

        //2.yontem

        ArrayList<Integer> reversedList= new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        System.out.println(reversedList);


    }
}
