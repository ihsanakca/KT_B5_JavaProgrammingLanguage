package day16_Branching_Statements;

public class C05_ClassTask1 {
    public static void main(String[] args) {
        //  1 den 100 e kadar 5 in katlarını ekrana
        //  yazdıran programı
        //  continue kullanarak yazınız

        for (int i = 1; i <= 100; i++) {

            if(!(i%5==0)){  //     i%5 != 0
                continue;
            }
            System.out.println(i+" ");

        }


    }
}
