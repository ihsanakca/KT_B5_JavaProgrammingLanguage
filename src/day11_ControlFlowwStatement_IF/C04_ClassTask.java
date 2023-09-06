package day11_ControlFlowwStatement_IF;

import java.util.Scanner;

public class C04_ClassTask {
    public static void main(String[] args) {
        /*
        fizik, kimya, matematik ve geçme notlarını konsoldan alın
        ortalamayı hessaplayın
        geçti ise "Tebrikler geçtiniz"
        kaldi ise "Ders tekrarı gerekmektedir."
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Ders notlarını giriniz");
        System.out.println("Fizik : ");
        double fiz=scan.nextDouble();
        System.out.println("Kimya : ");
        double kim=scan.nextDouble();
        System.out.println("Matematik : ");
        double mat=scan.nextDouble();
        System.out.println("Geçme notu : ");
        double gecmeNotu=scan.nextDouble();

        double ort=(fiz+kim+mat)/3;
        System.out.println("ort = " + ort);


        if (ort>gecmeNotu){
            System.out.println("Tebrikler geçtiniz");
        }
        else {
            System.out.println("Ders tekrarı gerekmektedir");
        }

        System.out.println("program bitti");






    }
}
