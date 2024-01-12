package day12_IF_SwitchCase;

public class C01_Summary {
    public static void main(String[] args) {

        System.out.println("A");

        if (false){
            System.out.println("B");
        } else if (false) {
            System.out.println("C");
        } else if (false) {
            System.out.println("D");
        }else {
            System.out.println("E");
        }

        System.out.println("G");

        int sayi = 0;

        if (sayi > 0) {
            System.out.println("Sayı pozitif");
        } else if (sayi < 0) {
            System.out.println("Sayı negatif");
        } else {
            System.out.println("Sayı sıfır");
        }


        int i=5;

        if (i==1){
            System.out.println("if bloğu");
            i++;
        } else if (i==2) {
            System.out.println("else if bloğu");
            i++;
        }else {
            System.out.println("else bloğu");
            i++;
        }

        System.out.println("i = " + i);

    }


}
