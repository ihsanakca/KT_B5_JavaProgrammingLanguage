package day11_ControlFlowwStatement_IF;

public class C07_ElseIf_Examples {
    public static void main(String[] args) {
        /*
        ayşenin cep harçlığı 5 liradan az ise babası ona 10 tl daha versin
        50 liradan fazla ise babası 20 tl sini alsın
        aksi durumda babası para vermesin ama almasın da


        int aysePara=45;
        if (aysePara<5){
            aysePara+=10;
        } else if (aysePara>50) {
            aysePara-=20;
        }else {

        }

        System.out.println("aysePara = " + aysePara);
*/





        /*
        3 adet iç açı alsın ve
        bunun üçgen olup olmadığını kontrol etsin
         */

        int x,y,z;
        x=60;
        y=50;
        z=70;
        int toplam=x+y+z;
        boolean durum=toplam==180;

        if (durum){
            System.out.println("Bu bir ücgendir");
        }else {
            System.out.println("Bu bir üçgen değildir");
        }

        System.out.println(toplam);
    }
}
