package day49_Exceptions;

import java.util.Scanner;

public class C03_Exceptions3 {
    public static void main(String[] args) {

        System.out.println("0");

        try{
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
            System.out.println(5/0);
            System.out.println("5");

        }catch (Exception e){

            System.out.println("6");
            try {
                System.out.println(5 / 0);
            }catch (Exception f){

                System.out.println("7");
            }
        }
        System.out.println("8");

    }
}
