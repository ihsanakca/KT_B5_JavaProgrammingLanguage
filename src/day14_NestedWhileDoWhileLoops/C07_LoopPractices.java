package day14_NestedWhileDoWhileLoops;

public class C07_LoopPractices {
    public static void main(String[] args) {
        for (int i=1;i<=10;i++){
            System.out.println("i = " + i);
        }
//        System.out.println("i = " + i);

        System.out.println("------------------------");

        int i=1;
        while(i<=10){
            System.out.println("i = " + i);
            i++;
        }

        System.out.println("------------------------");

        int j = 1;
        do{
            System.out.println("j = " + j);
            j++;
        }while (j<=10);


        System.out.println("------------------------");

        int k = 1;
        do{
            System.out.println("k = " + k);
            j++;
        }while (false);





    }
}
