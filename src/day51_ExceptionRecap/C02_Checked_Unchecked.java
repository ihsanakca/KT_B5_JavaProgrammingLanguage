package day51_ExceptionRecap;

import day39_ConstructorOverloading_Encapsulation.Student;

import java.io.FileInputStream;

public class C02_Checked_Unchecked {

    public static void main(String[] args) {

        System.out.println("----------Unchecked Exception---------------");

        int a=15;
        int b=0;

//        System.out.println(a/b);
//        System.out.println("Hello");

        char[] chars= {'A','B','C'};

        //System.out.println(chars[7]);

        Student student= null;

        //student.getClass();

        String str= "Java";

        str= null;

        System.out.println(str.toUpperCase());

        System.out.println("----------Checked Exception---------------");

        System.out.println("Hi");
        //Thread.sleep(3000);

        //FileInputStream file= new FileInputStream("");

    }
}
