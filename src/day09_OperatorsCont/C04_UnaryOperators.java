package day09_OperatorsCont;

public class C04_UnaryOperators {
    public static void main(String[] args) {

        //+,-,++,--

        int num1 = +3;  //unary operator
        int num2 = -5;  //unary operator

        System.out.println(num1>0);
        System.out.println(num2>0);

        System.out.println("---------------------------------");

        int a = 10;
        a++;      // a = a+1
        System.out.println(a); // a=11

        a--;      //a=a-1;  a=10
        System.out.println(a);  //a=10

        System.out.println("-----------------------------------");

        ++a;     //preincrement : sayinin degerini hemen bir artiriyorum  // a=11 11
        System.out.println(a);

        System.out.println(++a); //a=12 12

        --a;    //predecrement : sayinin degerini hemen bir azaltiyor   //a=11 11
         System.out.println(a); //a=11  11

        System.out.println(--a);  //a=10   10

        System.out.println("-----------------------------------");

        int b = 99;
        System.out.println(++b);    // preincrement b=100   100

        System.out.println("-----------------------------------");

        int c = 99;
        System.out.println(c++);    // 99   c=100;  // post increment cyi konsola 99 olarak yazdi -> cyi bir artirdi c=100
        System.out.println(c);      //c=100
        System.out.println(c++);    //100  // post increment cyi konsola 100 olarak yazdi -> cyi bir artirdi c=101
        System.out.println(c);      //101

        System.out.println("-----------------------------------");

        int x = 301;
        System.out.println(--x);  // pre decrement x=300 sonra ekrana xi yazacak

        System.out.println("-----------------------------------");
        int y= 301;
        System.out.println(y--);  //post decrement konsola 301 olarak yazdi, sonra y'i bir azaltti  y=300
        System.out.println(y);

        System.out.println("-----------------------------------");
        int z =33;
        System.out.println(++z);    // 34  z=34
        System.out.println(z++);    // 34  z=35
        System.out.println(z++);    // 35  z=36

        int i=52;
        System.out.println(i--); // 52 i=51
        System.out.println(i);
        System.out.println(--i); // 50 i=50
        System.out.println(i);






    }
}
