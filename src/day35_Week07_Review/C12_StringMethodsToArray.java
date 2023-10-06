package day35_Week07_Review;

import java.util.Arrays;

public class C12_StringMethodsToArray {

    public static void main(String[] args) {

        String str="Java";

        char[] charArray = str.toCharArray();

        System.out.println("Arrays.toString(charArray) = " + Arrays.toString(charArray));

        for (char each : charArray) {
            System.out.println(each);
        }
        System.out.println("----------------------");


        String str2="Hello Guys";
        String[] strArray = str2.split(" ");

        System.out.println(Arrays.toString(strArray));

        for (String each : strArray) {
            System.out.println(each);
        }

        System.out.println("----------------------");
        
        String s= "Bugün cuma. Bugun hava sıcak. Yarın daha soğuk olacak";

        String[] s1 = s.split("\\.");

        System.out.println(Arrays.toString(s1));
        System.out.println(s1[0]);


    }
}
