package day15_Week03_Review;

public class C04_SumOfOddNumbers {

    public static void main(String[] args) {

//        int sum = 0;
//        for (int i = 0; i < 100; i++) {
//            if (i % 2 != 0) {
//                sum += i;
//            }
//
//        }
//        System.out.println("sum = " + sum);


        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                continue; // skips the iteration : iterasyonu atlıyor
            }
            System.out.print(i+" ");
        }



        System.out.println("-----------------------------");

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println("-----------------------------");

        for (int i = 1; i < 100; i += 2) {
            System.out.print(i + " ");
        }
    }

}
