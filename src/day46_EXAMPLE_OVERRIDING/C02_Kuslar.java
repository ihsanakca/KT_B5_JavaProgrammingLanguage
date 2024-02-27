package day46_EXAMPLE_OVERRIDING;

public class C02_Kuslar extends C01_Hayvan{

    String solunum = "Kuslar akciğer solunumu yapar";
    String beslenme = "Kuslar et ve ot yerler";

    String ureme = "Yumurta ile";



    public void kanat(){
        System.out.println("kuşların kanadı vardır");
    }

    public void gaga(){
        System.out.println("kuşların gagası vardır");
    }

    public static void diri(){
        System.out.println("diri ve dipdiri");
    }
}
