package day30_Week06_Review;

import java.util.Scanner;

public class C03_NextVsNextLine {

    public static void main(String[] args) {
        String sampleText =
                " Programmers love Java!\n"
                        + " User input with Java is so easy!\n"
                        + " Just use the Scanner class.\n"
                        + " Or maybe the Console or JOptionPane?\n";

        Scanner input   = new Scanner(sampleText);

        System.out.println("input.nextLine() = " + input.nextLine());
        System.out.println("input.nextLine() = " + input.nextLine());
        System.out.println("input.nextLine() = " + input.next());
        System.out.println("input.nextLine() = " + input.next());
        System.out.println("input.nextLine() = " + input.next());






    }



}
