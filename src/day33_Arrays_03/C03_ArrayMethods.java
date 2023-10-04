package day33_Arrays_03;

import java.util.Arrays;
import java.util.Random;

public class C03_ArrayMethods {

    public static void main(String[] args) {

        //split

        String str = "Merhaba Guzel Insan";

        String[] strArray = str.split(" ");
        System.out.println(Arrays.toString(strArray));
        for (String s : strArray) {
            System.out.println(s);
        }

        //sort
        Arrays.sort(strArray);
        System.out.println(Arrays.toString(strArray));

        System.out.println("------------------------------");

        String[] strArray2 = str.split("");
        System.out.println(strArray2.length);
        System.out.println(Arrays.toString(strArray2));

        //toCharArray()
        char[] charArray = strArray[0].toCharArray();
        System.out.println(Arrays.toString(charArray));
        System.out.println(charArray);

        //copyOfRange()

        String[] students = {"rabia","samet","yusuf","ahmet","kerem"};


        String[] newList = Arrays.copyOfRange(students, 2, 4);
        System.out.println(Arrays.toString(newList));

        // sort()

        Random random = new Random();
        int numbers[]= new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i]= random.nextInt(50);
        }

        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));


        // fill()

        int[] numbers2 = new int[5];
        numbers2[0]=3;
        System.out.println(Arrays.toString(numbers2));

        Arrays.fill(numbers2,1,5,9);

        System.out.println(Arrays.toString(numbers2));





    }
}
