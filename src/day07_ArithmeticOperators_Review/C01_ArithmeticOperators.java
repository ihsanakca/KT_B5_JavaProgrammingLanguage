package day07_ArithmeticOperators_Review;

public class C01_ArithmeticOperators {
    public static void main(String[] args) {


        //++t  -> preIncrement
        //t++  -> postIncrement
        //--t  -> preDecrement
        //t--  -> postDecrement

        //t'nin değerini 1 arttırın ve yeni değerini oluşturacağınız u variable'ına atayın

        int t = 10;
        t++;
        int u = t;

        System.out.println("t :" + t + ", u " + u);  //t :11, u 11

        //t'nin değerini u'ya atayın ve t'nin değerini 1 arttırın

        t = 10;
        u = t;
        t++;

        System.out.println("t :" + t + ", u " + u);  //t :11, u 10

        System.out.println("--------------------");

        //bu işlemleri tek satırda yapabiliriz;
        //t'nin değerini 1 arttırın ve yeni değerini oluşturacağınız u variable'ına atayın

        t = 10;
        u = ++t;  //önce arttırır sonra atama yapar

        System.out.println("t :" + t + ", u " + u);  //t :11, u 11

        //t'nin değerini u'ya atayın ve t'nin değerini 1 arttırın

        t = 10;
        u = t++;

        System.out.println("t :" + t + ", u " + u);  //t :11, u 10

        System.out.println("--------------------");

        t = 10;
        u = t++;
        int w = u++ + t;
        System.out.println("w = " + w + " u= " + u + " t= " + t);


        System.out.println("--------------------");


        int x = 1;
        int y = 1;
        boolean bl = x++ < ++y;  // x is still 1,   y is 2 ==> true

        System.out.println("Result " + x + ":" + y + " " + bl);  // x ix used again so x becomes 2

        System.out.println("--------------------");

        int i = 10;
        int j = 20;
        int k = (j += i) / 5;        // k = 30/5 =6
        // (j = j+i) = (j = 30)  in parentheses j is equalized to 30
        System.out.println(i + " : " + j + " : " + k);

        System.out.println("--------------------");


        int a = 3;
        int b = 2;
        int c = 1;
        int r1 = a * b / c + 1;
        int r2 = a / b * c + 1;
        int r3 = a * (b / (c + 1));
        System.out.println(r1 + " : " + r2 + " : " + r3);   //7 : 2 : 3

        System.out.println("--------------------");

        int aVar = 9;

        boolean bl_2 = aVar-- <= 9;

        System.out.println(aVar + " Hello Universe! " + bl_2);  //8 Hello Universe! true

        System.out.println("--------------------");

        int m = 1;
        int n = 0;

        boolean bl_3 = m++ > ++n;  //false

        System.out.println("log " + m + " : " + n + " " + bl_3);  //log 2 : 1 false

        System.out.println("--------------------");

        int num = 100;
        int num_1 = num++;  //num_1=100
        int num_2 = ++num;  //num_2=102
        int num_3 = num++; //num_3=102  //num=103

        System.out.println("Result " + num + " : " + num_1 + " " + num_2 + " " + num_3);  //Result 103 : 100 102 102

        System.out.println("--------------------");

        int rakam = 10;
        int rakam_1 = 3;
        int rakam_2 = 5;
        int rakam_3 = 20;
        int rakam_4 = 16;

        int result;
        // result*=rakam;  çünkü result başlatılmayabilir.
        result = rakam--;
        result *= rakam_1;
        result /= rakam_2;
        result += rakam_3;
        result -= rakam_4;

        System.out.println("result = " + result);  //10
        System.out.println("rakam = " + rakam);   //9

        result = -rakam;  //eksi yapabiliriz..
        System.out.println("result = " + result);

        result = -(result);  // -(-9) -> +9 olur.
        System.out.println("result = " + result);

        System.out.println("--------------------");
        //modulus -- kalan operatörü %
        int z = 36;
        int h = 5;
//        int return=z%h;  keywordler variable ismi oolarak kullanılamazlar.
//        z = z % h;
        z%=h;  //---> z = z % h;
        System.out.println("z = " + z);


        //arithmetic exception
        int sayi_1 = 5;
        int sayi_2 = 0;

        // int sonuc=sayi_1/sayi_2;


    }

}


