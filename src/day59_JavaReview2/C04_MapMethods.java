package day59_JavaReview2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class C04_MapMethods {

    public static void main(String[] args) {

        /*
        Methods of Map:
		put(key, value): inserts the given key and value to map
		get(key): returns the value of the given key
		replace(key, newValue): replaces the value of the given key with the given new value
		remove(key): removes the given key and its value from the map
		containsKey(key): returns true if the given key is contained in the map, otherwise returns false
		containsValue(Value): returns true if the given value is contained in the map, otherwise returns false
		isEmpty(): returns true if the size of the map is 0, otherwise returns false
		equals(Map): returns true if the given Map is equal with the current map, otherwise returns false
		clear(): removes all the pairs from the map
		---------------------------

		keySet(): returns all the keys of the map, returnType is Set
		values(): returns all the values of the map, returnType is Collection
		entrySet(): returns all the entries (Entry: key & value) of map

				getkey()
				getValue()
				setValue()

         */

        Map<String, Integer> students= new LinkedHashMap<>();
        students.put("Ali",75);
        students.put("Aliye",80);
        students.put("Mehmet",90);
        students.put("Murat",72);
        students.put("Berna",94);


        System.out.println(students);

        System.out.println(students.get("Murat"));

        System.out.println(students.size());

        students.replace("Berna",84);
        System.out.println(students.get("Berna"));
        System.out.println(students);

        students.remove("Aliye");
        System.out.println(students);
        System.out.println(students.size());

        System.out.println(students.containsKey("Aliye"));
        System.out.println(students.containsValue(72)); //true
        System.out.println(students.containsValue("72"));

        Map<String,Integer> successfulStudents = new LinkedHashMap<>();
        successfulStudents.putAll(students);
        System.out.println(successfulStudents);

        Map<String,Integer> successfulStudents2 = new LinkedHashMap<>(students);
        System.out.println(successfulStudents2);

        students.clear();
        System.out.println(students);
        System.out.println(students.isEmpty());
        System.out.println("successfulStudents2.isEmpty() = " + successfulStudents2.isEmpty());


    }
}
