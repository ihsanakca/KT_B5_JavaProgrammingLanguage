package day14_NestedWhileDoWhileLoops;

public class C04_NestedForLoops {
    public static void main(String[] args) {
        for (int i=1; i<=7; i++){
            for (int j =1; j<=6;j++ ){
                System.out.print(1);
            }

            System.out.println();
        }


        System.out.println("---------------------------");
       for (int i= 1; i<=6;i++){     //***
           for (int j =1; j<=i ;j++){
               System.out.print("*");
           }
           System.out.println();
       }

        System.out.println("---------------------------");
        for (int i=6; 1<=i; i--){
            for (int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}


/*Örnek 1: Ekran çıktısı aşağıdaki gibi olacak kodu yazınız.
111111
111111
111111
111111
111111
111111
111111
Örnek 2: Ekran çıktısı aşağıdaki gibi olacak kodu yazınız.(tek yıldız
        kulanarak)
        *
        **
        ***
        ****
        *****
        ******


Örnek 3: Ekran çıktısı aşağıdaki gibi olacak kodu yazınız.(tek yıldız
kulanarak)
******
*****
****
***
**
*




*/