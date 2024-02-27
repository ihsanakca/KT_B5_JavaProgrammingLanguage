package day43_inheritanceExample;

public class C02_Child extends C01_Parent{

    protected static int x =10;

    public C02_Child(int z) {
        super(z);
    }


    public static void main(String[] args) {

        System.out.println("x = " + x);


        C02_Child obj = new C02_Child(9);
        System.out.println("obj.y = " + obj.y);
        obj.y = 24;
        System.out.println("obj.y = " + obj.y);



    }
}
