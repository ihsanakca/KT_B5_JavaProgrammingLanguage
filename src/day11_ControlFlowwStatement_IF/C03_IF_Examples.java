package day11_ControlFlowwStatement_IF;

public class C03_IF_Examples {
    public static void main(String[] args) {
          /*
    alinin fizik notu 50
    kimya notu 30
    ortalaması 50 üzerinde ise ekrana geçti yazsın
    50 altında ise herhangi bir şey yazdırmasız
     */

        double f=50;
        double k=60;
        double ort=(f+k)/2;

        System.out.println("ort = " + ort);
        if (ort>50){
            System.out.println("Ali geçti");
            System.out.println("Öğretmen ali tebrik etti");
        }else {
            System.out.println("Ali kaldı");
            System.out.println("Öğretmen Ali'ye çok çalış dedi.");
        }
        System.out.println("program bitti");


    }
}
