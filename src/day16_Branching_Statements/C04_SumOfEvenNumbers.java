package day16_Branching_Statements;

public class C04_SumOfEvenNumbers {
    public static void main(String[] args) {
        //0 ve 20 dahil aradaki çift sayıların
        // toplamını ekrana yazdıran programı yazınız


        //1.Yol
/*
        int sum=0;
        for (int i = 0; i <= 20; i+=2) {
            sum+=i;
        }

        System.out.println(sum);

*/

        //2. yol
/*
        int sum=0;
        for (int i = 0; i <= 20; i++) {
            if(i%2==0){
                sum+=i;
            }
        }

        System.out.println(sum);

*/

   //  3. yol

   int sum=0;//2
        for (int i = 2; i <=20 ; i++) {
            if (i%2==1){
                continue;
            }

            sum+=i;
        }


        System.out.println("sum = " + sum);


    }
}
