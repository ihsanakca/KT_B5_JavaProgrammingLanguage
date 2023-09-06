package day13_ForLoops;

import java.nio.channels.AsynchronousServerSocketChannel;
import java.util.Scanner;

public class C07_ParolayiTahminEt {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        String parola = "safak";
        String tahmin ="";
        System.out.print("Parolayi Tahmin Ediniz (Toplam 3 hakkiniz var) : ");
        int hak = 3;

        for(int i=1;i<=3;i++){
            tahmin = scanner.nextLine();
            if(tahmin.equals(parola)){
                System.out.println("Tebrikler... Parolayi bildiniz...");
                break;
            }else{
                System.out.println("Parola Yanlis... Kalan Tahmin hakkiniz "+(hak-i));
            }
        }



    }
}
