package day07_AritmeticOperators;


import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.logging.SocketHandler;

public class C04_ScannerIntro {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
/*
        System.out.println("Please enter a word :");
        String str=scan.nextLine();  // string değer olmak için
        System.out.println("The word you entered is "+str+".");
*/
        System.out.println("Kimya notu giriniz :");
        int kimyaNotu=scan.nextInt();//   int değer almak için
        System.out.println("Fizik notu giriniz :");
        int fizikNotu=scan.nextInt();
        System.out.println("Matematik notu giriniz :");
        int matematikNotu=scan.nextInt();
        double ortalama=(double) (kimyaNotu+fizikNotu+matematikNotu)/3;
        System.out.println("ortalama = " + ortalama);

        // 80 üstü geçer.  öğrenci gecer ise true kalır ise false
        boolean gectiKaldi=  ortalama==80;

        System.out.println("gectiKaldi = " + gectiKaldi);

        System.out.println("kimyaNotu = " + kimyaNotu);

    }
}
