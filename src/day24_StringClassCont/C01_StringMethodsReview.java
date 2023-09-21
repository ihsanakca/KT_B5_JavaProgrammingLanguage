package day24_StringClassCont;

import java.util.Scanner;

public class C01_StringMethodsReview {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen isminizi giriniz: ");
        String isim = scanner.nextLine();

        char ilkHarf = isim.charAt(0);
        System.out.println("ilkHarf = " + ilkHarf);

        int uzunluk = isim.length();
        char sonHarf = isim.charAt(uzunluk-1);
        System.out.println("sonHarf = " + sonHarf);

        //equals(), equalsIgnoreCase()
        System.out.println("isim == \"Osman\" = " + isim == "Osman");
        System.out.println("isim.equals(\"Osman\") = " + isim.equals("Osman"));
        System.out.println("isim.equalsIgnoreCase(\"Osman\") = " + isim.equalsIgnoreCase("Osman"));

        //toUpperCase(), toLowerCase()
        System.out.println("isim = " + isim);
        System.out.println("isim.toLowerCase() = " + isim.toLowerCase());
        System.out.println("isim = " + isim);
        isim = isim.toLowerCase();  //  OSMAN osman
        System.out.println("isim = " + isim);

        //trim()
        System.out.println("isim.trim() = " + isim.trim());
        System.out.println("isim = " + isim);


        //indexOf()
        System.out.println("isim.indexOf('a') = " + isim.indexOf('a'));
        System.out.println("isim.indexOf(\"a\") = " + isim.indexOf("a"));

        //lastIndexOf()
        System.out.println("isim.lastIndexOf('a') = " + isim.lastIndexOf('a'));

        //osmaaaaaaan
//          01234567890
        int ilkIndeks = isim.indexOf('a');
        int sonIndeks = isim.lastIndexOf('a');

        String result = ilkIndeks == sonIndeks ? "Harf tektir" : "Harf tek degildir";
        System.out.println("result = " + result);

        if(ilkIndeks==sonIndeks){
            result="Harf tektir";
        }else {
            result="Harf tek degildir";
        }
        System.out.println("result = " + result);

        //replace()
        System.out.println("isim.replace(\"a\",\"e\") = " + isim.replace("a", "e"));
        System.out.println("isim.replace(\"os\",\"suley\") = " + isim.replace("os", "suley"));

        //contains()

        System.out.println("isim.contains('a') = " + isim.contains(""+'a'));


    }
}
