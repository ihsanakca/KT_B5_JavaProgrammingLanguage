package day51_ExceptionRecap;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C03_TryCatchBlocks {

    public static void main(String[] args) {

        System.out.println("Test1 started");

        try {
            System.out.println(9 / 0);

            System.out.println(" Try Block");
        } catch (ArithmeticException e) {
            System.out.println("Catch Block");
        }
        System.out.println("Test1 completed");


        System.out.println("Test2 started");

        int [] nums={1,5,8,9,11};

        try{
        System.out.println(nums[75]);}
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Catch2 Block");
            System.out.println("e.getMessage() = " + e.getMessage());
            //e.printStackTrace();
        }
        System.out.println("Test2 completed");



        System.out.println("Test3 started");

        try {
            System.out.println("Java".substring(2, 0));
        }
        catch (RuntimeException s){
            System.out.println("Catch3 Block");
            System.out.println(s.getMessage());
        }

        System.out.println("-------------------Checked--------------------");

        System.out.println("Test4 started");

        try{
        Thread.sleep(2000);
        }
        catch (InterruptedException e){
            System.out.println("Catch Block ");
            System.out.println(e.getMessage());
        }

        System.out.println("Test5 started");

        try {
            FileInputStream file = new FileInputStream("path");
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }

    }
}
