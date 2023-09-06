package day12_IF_SwitchCase;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class C05_Nested_IF {
    public static void main(String[] args) {
        // Bir havuz girişte kullanıcıya 18 yaşında olup olmadığını
        //sorun 18 yaşın altında ise giremezsiniz şeklinde ikaz verip
        // 18 ve üzerinde ise yanında bayan olup olmadığını sorun
        // bayan yok ise giremesin
        //bayan var ise yüzme bilip bilmediğiniz sorun
        //yüzme bilmiyor ise yine giriş yapamasın

        Scanner scan=new Scanner(System.in);
        System.out.println("Yaşınızı giriniz : ");
        int age=scan.nextInt();

        if (age>=18){
            System.out.println("Yanınızda bayan var mı? Evet/Hayır");
            String cevap=scan.next();
            if (cevap.equalsIgnoreCase("Evet")){
                System.out.println("Yüzme biliyormusunuz?Evet/Hayır");
                String cevap2= scan.next();
                if (cevap2.equalsIgnoreCase("Evet")){
                    System.out.println("Hoş geldiniz");
                }else{
                    System.out.println("Yüzme bilmeyenler giriş yapamaz");
                }
            }else {
                System.out.println("yanınızda bayan olmadığı için giremezsiniz");
            }
        }else {
            System.out.println("Giremezsiniz");
        }
    }
}
