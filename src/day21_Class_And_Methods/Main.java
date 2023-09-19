package day21_Class_And_Methods;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /*



        int num1=6;
        int num2=5;

        Calculator calculator=new Calculator();
        System.out.println("calculator.add(4,7) = " + calculator.add(4, 7));
        System.out.println("calculator.average(num1,num2) = " + calculator.average(num1, num2));
        Calculator azxc=new Calculator();
        azxc.add(3,8);
        azxc.average(34,78);

        Random ran=new Random();
*/  /*

        Person ali=new Person();
        ali.name="Ali";
        ali.age=23;
        ali.gender="Erkek";
        ali.tcNo="1233456789";
        ali.uyu();

        System.out.println("ali.name = " + ali.name);
        System.out.println("ali.age = " + ali.age);
        System.out.println("ali.tcNo = " + ali.tcNo);
        System.out.println("ali.gender = " + ali.gender);


        Person ahmet=new Person();
        ahmet.name="Ahmet";
        ahmet.age=15;
        ahmet.tcNo="0987543321";
        ahmet.gender="Erkek";
        ahmet.yılSonuOrtalama=79;
        ahmet.uyu();
        System.out.println("ahmet.average(ahmet.yılSonuOrtalama) = " + ahmet.average(ahmet.yılSonuOrtalama));



        Fields marka, model, renk, hiz
        Methods calistir, hizlan, dur
        Javada Car class oluşturun?



        Car car1=new Car();
        car1.marka="Honda";
        car1.model="Jazz";
        car1.renk="Beyaz";
        car1.hız=180;

        car1.calistir();
        car1.hızlan();
        car1.dur();

        System.out.println("----------");

        Car car2=new Car();
        car2.marka="Mercedes";
        car2.model="E200d";
        car2.renk="Beyaz";
        car2.hız=180;

        car2.calistir();
        car2.hızlan();
        car2.dur();


        int n=5;
        String str="Ahmet";
        System.out.println("str = " + str);
        */

        String str=new String();
        str="Ahmet";
        String str1= new String();
        str1="Ahmet";

        System.out.println(str==str1);


        //     stack   heap
        Person ahmet=new Person();
        ahmet.name="Ahmet";
        System.out.println("ahmet = " + ahmet);//day21_Class_And_Methods.Person@2d98a335

        //     stack     heap
        Person mehmet=new Person();
        mehmet.name="Mehmet";
        System.out.println("mehmet = " + mehmet);//day21_Class_And_Methods.Person@16b98e56

        System.out.println(mehmet==ahmet);


        ahmet= mehmet;//day21_Class_And_Methods.Person@16b98e56
        mehmet.name="mustafa";

        System.out.println("ahmet.name = " + ahmet.name);

/*

        Circle circle1=new Circle();
        System.out.println("circle1.r = " + circle1.r);
        System.out.println("circle1.pi = " + circle1.pi);
     //   System.out.println("circle1.b = " + circle1.b);

        circle1.r=5;

        circle1.getArea();
        System.out.println("circle1.getPerimeter() = " + circle1.getPerimeter());


        Circle circle2=new Circle();
        circle2.r=20;
        circle2.getArea();


*/
    }

}
