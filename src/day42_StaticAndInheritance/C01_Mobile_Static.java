package day42_StaticAndInheritance;

public class C01_Mobile_Static {
    String brand;
    int price;
    static String name; // bütün objeler için ortak hale getirdik

    static {

        name="Phone";
        System.out.println("In static block");
    }

    public C01_Mobile_Static(){
        brand="";
        price=200;
        System.out.println("In constructor");
    }
    public void show(){
        System.out.println(brand+" : "+price+" : "+name);
    }
    public static void show1(C01_Mobile_Static obj){
        System.out.println(obj.brand+" : "+obj.price+" : "+name);
    }
}
