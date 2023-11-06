package day56_LoopsAndMap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C05_MapIntro {
    public static void main(String[] args) {
        Map<String , Integer> students=new HashMap<>();

        students.put("Yusuf", 24);
        students.put("Burcu",21);
        students.put("Osman",27);
        students.put("Atakan",18);
        students.put("Yusuf",18);


        System.out.println(students);
// TreeMap ---{Atakan=18, Burcu=21, Osman=27, Yusuf=24}
// HashMap ----{Atakan=18, Yusuf=24, Burcu=21, Osman=27}


        System.out.println(students.get("Yusuf"));

        System.out.println(students.keySet());

        for ( String name: students.keySet() ) {
            System.out.println(name+ " : "+ students.get(name));

        }


    //    System.out.println(students.remove("Atakan"));

        System.out.println(students.containsKey("Atakan"));
        System.out.println(students.containsValue(27));

        students.clear();


        System.out.println(students.containsKey("Atakan"));
        System.out.println(students.containsValue(27));




    }
}
