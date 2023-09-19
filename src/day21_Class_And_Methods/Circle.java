package day21_Class_And_Methods;

public class Circle {
    /*
    Fields yaricap pi=3.14
Methods alanHesapla()
cevreHesapla()

     */

    int r;
    double pi=3.14;
    //boolean b;

    public void getArea(){
        double result=pi*r*r;
        System.out.println("result = " + result);
    }

    public double getPerimeter(){
        return 2*pi*r;
    }



}
