package day16_PRACTICE;

public class C02_Max1020 {
    public static void main(String[] args) {
        /*

        Given 2 positive int values, return the larger value that is
        in the range 10..20 inclusive, or return 0 if neither is in that range.


        max1020(11, 19) → 19
        max1020(19, 11) → 19
        max1020(11, 9) → 11
         */
        // aralık 10 ila 20 'dir.
        //a ve b aralıkta ise büyüğü
        // a aralıkta b değil ise a
        // b aralıkta a değil ise b
        // her ikisi de aralıkta değil ise 0
        int a = 20;
        int b = 19;
        int max = 0;
        if ((a > 9 && a < 21) && (b > 9 && b < 21)) {
            max = a > b ? a : b;
        } else if (a > 9 && a < 21)  {
            max = a;
        } else if (b > 9 && b < 21) {
            max = b;
        } else {
            max = 0;
        }

        System.out.println("max = " + max);

        int x =11;
        int y = 65;
        int max_2 = 0;

        // First make it so the bigger value is in x
        if (y > x) {
            int temp =x;
            x = y;
            y = temp;
        }

        // Knowing a is bigger, just check a first
        if (x >= 10 && x <= 20) max_2 = x;
        if (y >= 10 && y <= 20) max_2 = y;

        System.out.println("max_2 = " + max_2);
    }
}
