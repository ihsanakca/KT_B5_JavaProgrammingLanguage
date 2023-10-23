package day43_Inheritance_AccessModifiers;

public class C20_Demo {
    public static void main(String[] args) {
        C22_Kare kare=new C22_Kare();
        kare.kenaruzunluğu=8;
        System.out.println("kare.alanHesapla() = " + kare.alanHesapla());


        C23_Daire daire=new C23_Daire();
        daire.yaricap=5;
        System.out.println("daire.alanHesapla() = " + daire.alanHesapla());

        C24_Ucgen ucgen=new C24_Ucgen();
        ucgen.tabanUzulugu=12;
        ucgen.yukseklik=10;
        System.out.println("ucgen.alanHesapla() = " + ucgen.alanHesapla());


    }
}
