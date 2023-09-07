package day14_NestedWhileDoWhileLoops;

import java.util.Scanner;

public class C01_Faktoriyel {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Sayi : ");
        int num = scanner.nextInt();
        int faktoriyel = 1;


        for(int i=1; i<=num ;i++){

            faktoriyel = faktoriyel * i;
        }

        System.out.println(num+"! = "+faktoriyel);

    }



}
//Faktoriyel = Girilen sayiya kadar sayilarin carpimi
// 3!=3*2*1 = 6
// 4!=4*3*2*1 = 4*3!= 4*3*2!= 24
// 0! =1

