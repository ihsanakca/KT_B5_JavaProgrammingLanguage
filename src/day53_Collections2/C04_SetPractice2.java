package day53_Collections2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class C04_SetPractice2 {
    public static void main(String[] args) {
        String str ="Aman Kendini vurmuş  100 kiloluk bir zenci";
        //Bu string icinde kac tane farkli harf var?
//        Set<Integer> set1 = new HashSet<>();
//        set1.add(1);
//        set1.add(1);
//        set1.add(10);
//        set1.add(10);
//        set1.add(15);
//        set1.add(15);
//        set1.add(15);
//        System.out.println(set1);
//        set1.remove(15);
//        System.out.println(set1);

        System.out.println("uniqueLetterCount(str) = " + uniqueLetterCount(str));
    }
    public static int uniqueLetterCount(String str){
        String[] strArr = str.replace(" ", "").split("");
        Set<String> uniqueChars = new TreeSet<>();
        for (String s : strArr) {
            uniqueChars.add(s);
        }
        System.out.println(uniqueChars);
        return uniqueChars.size();
    }

}
