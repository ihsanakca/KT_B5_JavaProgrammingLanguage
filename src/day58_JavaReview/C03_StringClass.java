package day58_JavaReview;

public class C03_StringClass {
    public static void main(String[] args) {


        //String Literals are shared in StringPool
        //String literal is faster than new keyword
        String str = "school";
        String str1 = "school"; // StringPool
        String str2 = "school"; // StringPool
        String str3 = new String("school");
        String str4 = new String("school");

//        StringBuffer stringBuffer = "school";      //String pool or string literal can not be used in StringBuffer and StringBuilder
//        StringBuilder stringBuilder = "school";

        StringBuffer stringBuffer = new StringBuffer("school");
        System.out.println("stringBuffer = " + stringBuffer);

        StringBuilder stringBuilder = new StringBuilder("school");
        System.out.println("stringBuilder = " + stringBuilder);

        System.out.println("str.concat(\" garden\") = " + str.concat(" garden")); // Strings are immutable
        System.out.println("str = " + str);

        //StringBuffer and StringBuilder are mutable
        stringBuffer.append(" garden");
        System.out.println("stringBuffer = " + stringBuffer);

        stringBuilder.append(" garden");
        System.out.println("stringBuilder = " + stringBuilder);

        stringBuffer.reverse();
        System.out.println("stringBuffer = " + stringBuffer);

        stringBuilder.reverse();
        System.out.println("stringBuilder = " + stringBuilder);

        System.out.println("---------------------------------");
        String str5 = str3.toUpperCase();
        System.out.println("str3 = " + str3);
        System.out.println("str5 = " + str5);


    }
}
