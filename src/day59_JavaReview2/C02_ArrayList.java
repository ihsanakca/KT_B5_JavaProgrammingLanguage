package day59_JavaReview2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_ArrayList {

    public static void main(String[] args) {

// part of collection
        // internally uses the array
        // * does not support primitives --> use Wrapper Class
        // * size is dynamic
        // * does not have default values

        //1.yol
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println(numbers);

        numbers.add(1);
        System.out.println(numbers);
        System.out.println(numbers.size());
        numbers.addAll(Arrays.asList(2, 3, 4));
        System.out.println(numbers);
        System.out.println(numbers.size());

        //2.yol

        ArrayList<String> countries = new ArrayList<>() {
            {
                add("UK");
                add("Japan");
                add("Turkey");
            }
        };
        System.out.println(countries);

        countries.add("Germany");
        System.out.println(countries);

        // Arrays.asList returns a mutable list while the list returned by List.of is immutable:

        //3.yol
        ArrayList<String> cities= new ArrayList<>(Arrays.asList("London","Tokyo","Ankara"));
        System.out.println(cities);
        cities.add("Istanbul");
        System.out.println(cities);

        //4.1 yol
        ArrayList<String> colors= new ArrayList<>(List.of("Blue","Red","White"));
        System.out.println(colors);
        colors.add("Purple");
        System.out.println(colors);

        //4.2 yol
        List<String> colors2= List.of("Blue","Red","White");
        System.out.println(colors2);
        //colors2.add("Purple"); // UnsupportedOperationException
        System.out.println(colors2);


    }
}
