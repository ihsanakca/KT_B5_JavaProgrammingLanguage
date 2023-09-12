package day16_Branching_Statements;

public class C01_Summary {
    public static void main(String[] args) {
        //Piramit
        //    *
        //   * *
        //  * * *
        // * * * *
        //* * * * *


        for (int i = 1; i < 6; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = i; k>0; k--) {
                System.out.print("* ");
            }
            System.out.println();

        }





    }
}
