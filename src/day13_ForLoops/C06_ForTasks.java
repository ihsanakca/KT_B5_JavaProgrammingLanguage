package day13_ForLoops;

public class C06_ForTasks {
    public static void main(String[] args) {
        //Bir program yazın ve [0-100] arasındaki tüm sayıları yazdırsın.
        for (int i = 0;i<=100;i++){
            System.out.println("i = " + i);
        }
        System.out.println();
        System.out.println("------------------------------");


        //Bir program yazın ve 15-100 arasındaki tüm sayıları yan yana yazdırsın.
        for (int i=15;i<=100;i++){

            System.out.print(i+" ");
        }

        System.out.println();
        System.out.println("------------------------------");

          //0 dan 100 e kadar olan sayıları tersten ekrana yazdırın. (100 99 98 97 vs)
        for (int i=100; 0<=i;i--){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("------------------------------");

        //Bir program yazın ve 0-100 arasındaki tüm çift sayıları yazdırsın.
        for (int i=2;i<100;i+=2){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("------------------------------");

        for (int i = 1;i<100;i++){
            if(i%2==0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println("------------------------------");
        //Bir program yazın ve 0-100 arasındaki tüm tek sayıları yazdırsın.
        for (int i = 1;i<100;i++){
            if(i%2==1) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println("------------------------------");

        for (int i=1;i<100;i+=2){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("------------------------------");

        //Bir program yazın ve [1-100] arasındaki sayıların toplamını konsola yazdırın
        int sum = 0;
        for (int i=1;i<=100;i++){

            sum+=i; // sum = sum + i;
        }
        System.out.println("sum = " +sum);


    }
}
