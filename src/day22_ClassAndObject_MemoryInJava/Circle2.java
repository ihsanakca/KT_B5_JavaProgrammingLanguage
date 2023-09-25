package day22_ClassAndObject_MemoryInJava;

public class Circle2 {
    int r;
    //double pi=Math.PI;
    //boolean b;



    public double getArea(){
        return Math.PI*Math.pow(r,2);
    }

    public double getPerimeter(){
        getPerimeter2();

        return 2*Math.PI*r;
    }

    public static double getArea2(){

        getPerimeter2();
        return Math.PI;
    }

    public static double getPerimeter2(){
        return 2*Math.PI;
    }

}
