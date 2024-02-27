package day46_EXAMPLE_OVERRIDING;

public class C02_AvciKus extends C02_Kuslar {
    String beslenme = "Avci kuşlar et yer";



    public void hareket(){
        System.out.println("Avcı kuşlar uçarlar");
    }

    public void gaga(){
        System.out.println("Avcı kuşlar sivri gagalıdır.");
    }

    public void print(){
        System.out.println(this.beslenme);
        System.out.println(super.beslenme);
        System.out.println(super.solunum);
    }

    public static void main(String[] args) {
        C02_AvciKus avciKus = new C02_AvciKus();

        System.out.println(avciKus.solunum);
        System.out.println(avciKus.beslenme);
        System.out.println(avciKus.ureme);
        avciKus.kanat();
        avciKus.omur();
        avciKus.gaga();
        avciKus.hareket();
        avciKus.diri();

        C01_Hayvan hayvan = new C02_AvciKus();
        System.out.println(hayvan.solunum);
        System.out.println(hayvan.beslenme);
       // System.out.println(hayvan.ureme);
     //   hayvan.kanat();
        hayvan.omur();
     //   hayvan.gaga();
        hayvan.hareket();

        System.out.println("----------");

        avciKus.print();


    }

}
