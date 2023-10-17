package day42_StaticAndInheritance;

public class C02_Main_Static {
    public static void main(String[] args) throws ClassNotFoundException {
//        C01_Mobile_Static obj=new C01_Mobile_Static();
//        obj.brand="Apple";
//        obj.price=2000;
//        obj.name="SmartPhone";

//        C01_Mobile_Static obj1=new C01_Mobile_Static();
//        obj1.brand="Samsung";
//        obj1.price=1700;
//        obj1.name="SmartPhone";


       // obj1.name="Phone";
//        C01_Mobile_Static.name="Ahmet";
//
//        obj.show();
//        obj1.show();

//        C01_Mobile_Static.show1(obj);



//        C01_Mobile_Static obj2=new C01_Mobile_Static();
//        C01_Mobile_Static obj3=new C01_Mobile_Static();



        Class.forName("day42_StaticAndInheritance.C01_Mobile_Static"); // class load eden method otomatik olarak sadece static bloğu çalıştırı

        C01_Mobile_Static obj5=new C01_Mobile_Static();
        C01_Mobile_Static obj6=new C01_Mobile_Static();
    }

}
