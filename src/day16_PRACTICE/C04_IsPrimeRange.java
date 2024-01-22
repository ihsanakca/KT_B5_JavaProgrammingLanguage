package day16_PRACTICE;

public class C04_IsPrimeRange {
    public static void main(String[] args) {
        int baslangic = 1;
        int bitis = 100;
        boolean asalMi = true;
        int count = 0;

        for (int i = baslangic; i < bitis; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    asalMi = false;
                    break;
                }
            }
            if (asalMi) {
                System.out.println(i + " asal sayıdır.");
                count++;
            }
            asalMi = true;
        }
        System.out.println("count = " + count);
    }
}
