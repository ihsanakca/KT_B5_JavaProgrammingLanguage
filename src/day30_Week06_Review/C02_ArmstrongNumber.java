package day30_Week06_Review;

public class C02_ArmstrongNumber {

    public static void main(String[] args) {

//        System.out.println(isArmstrongNumber(153));
//        System.out.println(isArmstrongNumber(777));

        for (int i = 100; i < 1000; i++) {
            if (isArmstrongNumber(i)) {
                System.out.println(i);
            }


        }
    }

    public static boolean isArmstrongNumber(int number) {

        int sum = 0;
        int originalNumber = number;

        while (number > 0) {

            int lastDigit = number % 10; //remainder //3 //5 //1
            number = number / 10; // number /=10; //15 //1
            sum += (lastDigit * lastDigit * lastDigit); //27 + 125 +1

        }

        if(sum==originalNumber){
            return true;
        }
        return false;

    }
}
