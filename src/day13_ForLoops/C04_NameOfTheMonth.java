package day13_ForLoops;

import java.util.Scanner;

public class C04_NameOfTheMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter a number between [1-12] : ");
        int num= scanner.nextInt();

        String result="";

        if( num>=1 && num<=12){
            if(num==1){
                result="January";
            } else if (num==2) {
                result="February";
            } else if (num==3) {
                result="March";
            }else if (num==4) {
                result="April";
            }else if (num==5) {
                result="May";
            }else if (num==6) {
                result="June";
            }else if (num==7) {
                result="July";
            }else if (num==8) {
                result="August";
            }else if (num==9) {
                result="September";
            }else if (num==10) {
                result="October";
            }else if (num==11) {
                result="November";
            }else {
                result="December";
            }


        } else {
            result="Invalid Number For Month";
        }


        System.out.println(result);

    }
}
/* Bu ornegi Ternary ile coz*/