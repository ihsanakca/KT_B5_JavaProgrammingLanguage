package day40_Week08_Review;

import java.util.ArrayList;

public class C03_ArrayListMethods {

    public static void main(String[] args) {


        ArrayList<Integer> numbers= new ArrayList<>();

        numbers.add(10);
        System.out.println("numbers = " + numbers);
        int a= 5;
        numbers.add(a);
        System.out.println("numbers = " + numbers);
        numbers.add(2,25);
        System.out.println("numbers = " + numbers);
        numbers.add(2,7);
        System.out.println("numbers = " + numbers);

        //size

        System.out.println(numbers.size());

        System.out.println(numbers.get(1));

        // set---> replace


        ArrayList<String> names= new ArrayList<>();
        names.add("Java");
        names.add("JavaScript");
        names.add("C#");

        System.out.println(names);
        names.set(2,"Python");
        System.out.println(names);

        names.remove(0);
        System.out.println(names);

        names.remove("JavaScript");
        System.out.println(names);

        ArrayList<Integer> nums= new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(300);

        int n1= 1;
        Integer n2= 300;
        nums.remove(n1);
        System.out.println(nums);
        nums.remove(n2);
        System.out.println(nums);

        //clear
        nums.clear();
        System.out.println(nums);
        System.out.println("nums.size() = " + nums.size());
        System.out.println("nums.isEmpty() = " + nums.isEmpty());

        ArrayList<Character> chars = new ArrayList<>();
        chars.add('A');
        chars.add('A');
        chars.add('A');
        chars.add('A');
        System.out.println("chars.indexOf('A') = " + chars.indexOf('A'));
        System.out.println(chars.lastIndexOf('A'));

        System.out.println("chars.contains('A') = " + chars.contains('A'));
        System.out.println("chars.contains('F') = " + chars.contains('F'));


    }
}
