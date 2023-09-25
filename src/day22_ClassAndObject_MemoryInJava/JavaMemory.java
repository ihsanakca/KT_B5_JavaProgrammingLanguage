package day22_ClassAndObject_MemoryInJava;

import day21_Class_And_Methods.Car;

public class JavaMemory {

    public static int variable(int x,int y){

        Circle2 circle2=new Circle2();
        int b;
        for (int i = 0; i < 5; i++) {
            circle2.getPerimeter();
           b=5;
            System.out.println("b = " + b);
            int a=(i+=5);
            System.out.println("a = " + a);
        }
        for (int i = 0; i < 23; i++) {
            circle2.getArea();
            b=23;
        }
        int z=x+y;
        return z;
    }


    public static void main(String[] args) {
        Car car1=new Car();
        car1.model="Str";

        Circle2 circle2=new Circle2();
        System.out.println("circle2.r = " + circle2.r);


    }




}
