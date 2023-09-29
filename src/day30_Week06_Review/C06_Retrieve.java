package day30_Week06_Review;

import java.util.Scanner;

public class C06_Retrieve {

    public static void main(String[] args) {


        Scanner input   = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = input.nextLine();

        String letters = "";
        String digits = "";
        String specialChars = "";


        //String str = "mn@#123Ab!";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122) {
                letters += ch;
            } else if (ch >= 48 && ch <= 57) {
                digits += ch;
            }
            else{
                specialChars +=ch;
            }

        }
        System.out.println(letters);
        System.out.println(digits);
        System.out.println(specialChars);


    }
}
