package day57_MapANdFinish;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class C02_MapMethods {
    public static void main(String[] args) {
        //put() ,get(),values(),keyset(),clear(),containsKey(),remove(),entrySet(),equals(),forEach(),isEmpty()
        //putAll(),replace()

        Map<Integer,String > map=new TreeMap<>();
        map.put(12,"Samet Emsen");
        map.put(13,"Atakan Salik");

        System.out.println(map.get(13));

        System.out.println("---------------");

        System.out.println(map.values());

        System.out.println("---------------");


        Set<Integer> set = map.keySet();
        set.forEach(x-> System.out.println(x));

        System.out.println("---------------");

       // map.clear();
        System.out.println(map.containsKey(12));
        System.out.println(map.containsValue("Yusuf Yıldız"));


        System.out.println("---------------");


        //System.out.println(map.remove(12));
        System.out.println(map.remove(13, "Samet Emsen"));


        System.out.println("---------------");


        System.out.println(map.isEmpty());

        System.out.println("---------------");


        map.forEach((a,b)-> System.out.println("key : "+ a+" value : "+ b));

        System.out.println("---------------");


       // System.out.println(map.replace(12, "Dinçer Yıldız"));
        System.out.println(map.replace(13, "Samet Emsen", "Dinçer Yıldız"));



        System.out.println("map = " + map);

    }
}
