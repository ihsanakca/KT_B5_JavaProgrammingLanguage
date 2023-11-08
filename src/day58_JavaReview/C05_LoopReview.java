package day58_JavaReview;

import java.util.Scanner;

public class C05_LoopReview {
    public static void main(String[] args) {
        for(int i =1;i<20;i++){
            if(i%5==0){
                break;
//                return;
//                continue;
            }
            System.out.println("number "+i);
        }

        System.out.println("Loop is Over");


        System.out.println("--------------------");
        Scanner scanner =new Scanner(System.in);
        int num=0;
        while(num!=-1){
            System.out.print("Enter a number (exit by entering -1): ");
            num=scanner.nextInt();
            System.out.println("num = " + num);
        }

    }
}
