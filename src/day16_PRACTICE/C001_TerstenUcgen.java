package day16_PRACTICE;

public class C001_TerstenUcgen {
    public static void main(String[] args) {
        for (int i = 6; 1 <= i; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
