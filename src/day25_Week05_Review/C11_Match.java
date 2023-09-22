package day25_Week05_Review;

public class C11_Match {

    public static void main(String[] args) {

        String s1= "Konyaspor";

        boolean match1 = s1.matches("Konya"); //false
        boolean match2 = s1.matches("Konya(.*)"); //
        boolean match3 = s1.matches("Konyaspor"); //
        boolean match4 = s1.matches("(.*)spor"); // endsWith("spor")

        System.out.println(match1);
        System.out.println(match2);
        System.out.println(match3);
        System.out.println(match4);



    }

}
