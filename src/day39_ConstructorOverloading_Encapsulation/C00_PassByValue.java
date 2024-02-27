package day39_ConstructorOverloading_Encapsulation;

public class C00_PassByValue {
    public static void main(String[] args) {
        double price = 200;


       // double price = 200

        discountMethod(price);

        System.out.println("method call'dan sonra price = " + price);
    }

    public static void discountMethod(double price){
        price = price*0.9;
        System.out.println("price = " + price);
    }
}
//vegasta olan vegasta kalır..