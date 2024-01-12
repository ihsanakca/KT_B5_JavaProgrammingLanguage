package day07_ArithmeticOperators_Review;

public class C02_StringConcatenation {
    public static void main(String[] args) {
        String str="Ali";
        String str1="Veli";
        System.out.println(str+str1);  //AliVeli
        System.out.println(str    + " "+   str1);  //Ali Veli
        int i=20;
        int j=10;

        System.out.println( str + i + j); //Ali2010
        System.out.println(i + j + str); //30Ali
        System.out.println( str + (i + j)); //Ali30

        System.out.println(str+i*j); //Ali200St
        System.out.println(str+i/j); //Ali2
        System.out.println(str+i%j); //Ali0

        String s = i + j + str;
        System.out.println("s = " + s); //s = 30Ali
        String s1 = i + j + "";    //String s1="30";
        System.out.println("s1 = " + s1);  //s1 = 30

        System.out.println("--------------------");

        System.out.println("Result A " + 0 +1);  //Result A 01
        System.out.println("Result B " + (1) + (2));  //Result B 12
        System.out.println("Result C " + (1 + 2));  //Result C 3
        System.out.println(1 + 2 + " Result E " + (3) + (4)); //3 Result E 34
        System.out.println("Result "+3+2*5);  //Result 310

        System.out.println("--------------------");
        /*
        işlem önceliği
        1- ()   parantez
        2- * , / ve % (mod)  çarpma, bölme ve modulus (soldan sağa)
        3- +, -  toplama ve çıkarma (soldaan sağa)
         */
    }
}
