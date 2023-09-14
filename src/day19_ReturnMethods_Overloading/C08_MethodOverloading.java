package day19_ReturnMethods_Overloading;

public class C08_MethodOverloading {
    public static void main(String[] args) {
        System.out.println("sum(5,10) = " + sum(5, 10));
        System.out.println("sum(5,10) = " + sum(5.5, 10.5));
        System.out.println("sum(5,10,20) = " + sum(5, 10, 20));
    }


    public static int sum(int num1, int num2) {
        return num1 + num2;

    }

    public static double sum(double num1, double num2) {
        return (num1 + num2);

    }

    public static int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static double sum(double num1, double num2, double num3) {
        return (num1 + num2 + num3);

    }

    public static double sum(double num1, double num2, double num3, double num4) {
        return (num1 + num2 + num3 + num4);

    }

    public static int sum(int num1, int num2, int num3, int num4) {
        return num1 + num2 + num3 + num4;
    }

}


/* 1. create a method that can find the sum of two numbers


	    2. create a method that can find the sum of three numbers


	    3. create a method that can find the sum of four numbers*/