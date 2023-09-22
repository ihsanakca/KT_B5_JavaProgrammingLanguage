package day25_Week05_Review;

import java.util.Scanner;

public class C05_Frequency {

    public static void main(String[] args) {

//        String str = "AABACCCDC";
//        char ch = 'C';

        Scanner input= new Scanner(System.in);
        System.out.println("String");
        String str= input.nextLine();
        System.out.println("Char");
        char ch= input.next().charAt(0);



        int frequency = 0;

        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i)){
                frequency+=1;

            }


        }
        System.out.println(frequency);

    }
}
