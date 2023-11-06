package day56_LoopsAndMap;

import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C04_Collection_Sort {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(12,43,2,4,5,7,25);

        System.out.println(list.get(0));

        //Collections.sort(list);

        System.out.println(max2(list));

        System.out.println(list);

    }

    public static int max(List<Integer> list){
        Collections.sort(list);
        return list.get(list.size()-1);
    }



    public static int max2(List<Integer> list){

        List<Integer> copyList=new ArrayList<>();
        copyList.addAll(list);
        Collections.sort(copyList);
        return copyList.get(copyList.size()-1);
    }
}
