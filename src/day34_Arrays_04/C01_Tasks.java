package day34_Arrays_04;

import java.util.Arrays;

public class C01_Tasks {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(stringToArray("merhaba java insanları bugün nasılsınız")));
        System.out.println(Arrays.toString(stringToArray2("kayısı, armut, üzüm, çilek, nar")));


    }


    //«kayısı, armut, üzüm, çilek, nar» cümlesinde ki meyve isimlerini her biri bir
    //element olacak şekilde bir array a atın. Elementlerden 5 den az harfi olan
    //varsa onun yerine armut atayın.


    public static String[] stringToArray2(String str){
        String[] strArr = str.split(", ");
        for (int i = 0; i < strArr.length; i++) {

            if(strArr[i].length()<5){
                strArr[i]="armut";
            }
        }
        return strArr;
    }

    /**
     * this method converts the words of a string to a string array
     * @param str
     * @return
     */
    public static String[] stringToArray(String str){
    String[] strArr = str.split(" ");
    return strArr;
    }

}

//«merhaba java insanları bugün nasılsınız» gibi bir cümleyi her kelime bir
//element olacak şekilde bir array a dönüştüren bir method yazın.

