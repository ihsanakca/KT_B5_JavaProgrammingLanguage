package day51_ExceptionRecap;

import day48_OOPReview.scrumTeam.Employee;

import java.util.Scanner;

public class C04_MultiCatch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Bir kelime");
        String str = scanner.nextLine();
      //  str = null;

        try {

            System.out.println(str.length());
            System.out.println(str.substring(0, 8));
            int i = Integer.parseInt(str);

        } catch (NullPointerException e) {
            System.out.println("1st Catch");
            System.out.println(e.getMessage());
            e.printStackTrace();

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("2nd Catch");
            System.out.println(e.getMessage());
            e.printStackTrace();

        } catch (RuntimeException e) {
            System.out.println("3nd Catch");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("Kod bitti");

    }
}
