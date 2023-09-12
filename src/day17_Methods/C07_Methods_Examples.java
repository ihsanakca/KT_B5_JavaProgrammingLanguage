package day17_Methods;

import java.util.Scanner;

public class C07_Methods_Examples {

    public static void main(String[] args) {
/*
        average();
        System.out.println("------------");
        maxNumber();
        System.out.println("---");

        kgToOkkaConverter(20);
        square(3);
    */
    isimYaz("Mehmet");
    ortalama(14.5,34.7);

    ortalama(2,6);


    }

    /**
     * a method prints the average of given numbers
     */
    public static void average(){
        double x=3, y=7, z=13;
        double result=(x+y+z)/3;
        System.out.println("Average = "+result);

    }


    /**
     * a method that gives the max number
     */

    public static void maxNumber(){
        int x=100,y=20;
        int max;
        if (x>y){
            max=x;
        }else{
            max=y;
        }
        System.out.println("Max number is : "+ max);
    }

    /**
     * a method convert kilo to okka   1 okka =1,282 kg
     */
    public static void kgToOkkaConverter(double kg){

        double okka=kg/1.282;
        System.out.println(kg+ " kilgram "+ okka +" okkadır");

    }

    /**
     * a method that calculates the square of numbers
     */
    public static void square(int num){
        int result=num*num;
     //   System.out.println("result = " + result);
    }

    // parametre olarak isminizi alan ve sonucunda isminiz.... yazan programı yazınız
    public static void isimYaz(String name){
        System.out.println("İsminiz "+name);
    }

//iki sayının ortalamasını veren metodu yazınız
    public static void ortalama(double a,double b){
        double result=(a+b)/2;
        System.out.println("result = " + result);

    }




}
