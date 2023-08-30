package day08_ScannerAndOperators;

public class C03_ArithmeticOperators {
    public static void main(String[] args) {
        System.out.println("90"+10); // 9010, concatenation
        System.out.println(10+"90"); // 1090, concatenation
        System.out.println("90"+10+10); //901010, concatenation
        System.out.println("90"+(10+10)); //9020, concatenation
        System.out.println(10+"90"+10); //109010 , concatenation
        System.out.println(10+20+30+"90"); //6090 , concatenation
        System.out.println(""+10+20+"90"); //102090

        System.out.println("-----------------------------");
        char ch1 = 'a';
        String str1=""+ch1;
        System.out.println(ch1);
        System.out.println(str1);

        System.out.println("-----------------------------");
        System.out.println(100/3);
        System.out.println(10/4);
        System.out.println(10/4.0);
        System.out.println(10.0/4);
        System.out.println(10d/4);
        System.out.println("-----------------------------");

        int a = 100;
        double b = a; // implicit casting
        System.out.println(b);
        double c = 20;  // implicit casting
        System.out.println(c);

        double d = (double)a / 3;    // explicit casting
        System.out.println(d);

        System.out.println("------------------------------");

        System.out.println(10%3);
        System.out.println(10%4);
        System.out.println(10%2);
        System.out.println(10%11);
    }
}
