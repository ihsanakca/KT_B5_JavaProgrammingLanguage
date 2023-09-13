package day18_CustomMethods;

public class C02_CustomMethodsPractice {
    public static void main(String[] args) {
        helloWorld5Times();
        System.out.println("---------------------------");
        countdownTenToZero();
        System.out.println("---------------------------");
        evenNumbers();

    }



    public static void helloWorld5Times(){
       for(int i=1; i<=5;i++){
           System.out.println("Hello World");
       }
    }

    private static void countdownTenToZero(){
        int i=10;
        while (1<=i){
            System.out.print(i+" ");
            i--;
        }
        System.out.println();
    }

    public static void evenNumbers(){

        for (int i = 1; i <=100 ; i++) {
            if(i%2==0){
                System.out.print(i+" ");
            }



    }



}


}


//     a function that can print hello world 5 times ==> helloWorld5Times()
//     a function that print Ten to Zero  ==> countdownTenToZero()
//     a function that can print all the even numbers from [1 ~ 100] ==> evenNumbers
