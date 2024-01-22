package day16_PRACTICE;

public class C07_TamKare {
    public static void main(String[] args) {

        // girilen sayı tam kare ise true değilse false yazdırın

        int sayi = 100;
        int i=1;
        boolean bl=false;

        while (i*i<=sayi){
            if (i*i==sayi){
                bl =true;

            }
            i++;
        }
        System.out.println(i);
        System.out.println("bl = " + bl);
    }
}
