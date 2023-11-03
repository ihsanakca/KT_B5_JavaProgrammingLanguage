package day55_Week11_Review;

import java.util.*;

public class C07_CollectionsPractice {

    public static void main(String[] args) {

        List<String> items= new ArrayList<>();

        items.add("shoes");
        items.add("toys");

        System.out.println(items);

        Collections.addAll(items, "tshirts","hats");

        System.out.println(items);

        String[] arr= items.toArray(new String[0]);
        //Collections.sort(arr);

        Collections.sort(items);
        System.out.println(items);

        System.out.println("---------------");

        HashSet<Integer> integerHashSet = new LinkedHashSet<>();
        integerHashSet.add(2);
        integerHashSet.add(1);
        integerHashSet.add(2);
        integerHashSet.add(3);

        System.out.println("integerHashSet = " + integerHashSet);

        integerHashSet.addAll(Arrays.asList(7,8,0,5));

        System.out.println("integerHashSet = " + integerHashSet);

        //Collections.sort(integerHashSet);

        ArrayList<Integer> arrayList= new ArrayList<>(integerHashSet);

        Collections.sort(arrayList);

        System.out.println("arrayList = " + arrayList);


    }
}
