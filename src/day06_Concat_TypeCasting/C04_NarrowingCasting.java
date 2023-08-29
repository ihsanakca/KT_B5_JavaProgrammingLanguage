package day06_Concat_TypeCasting;

public class C04_NarrowingCasting {
    public static void main(String[] args) {
/*
        byte b=5;
        short sh=2564;

        b= (byte) sh;

        System.out.println(b);


        float fl=2.6f;
        int i=5;


        i= (int) fl;

        System.out.println(i);

        byte x=10;
        byte y=20;

        byte z= (byte) (x+y);  // narrowing casting

        short s1= (short)(x+y);

        int i1=x*y;


        byte num1=5;
        int num2=45;
        num1= (byte) num2;

        */
        double x=5.2;
        int y=2;

        int z= (int) (x+y);

        System.out.println(z);

    }
}
