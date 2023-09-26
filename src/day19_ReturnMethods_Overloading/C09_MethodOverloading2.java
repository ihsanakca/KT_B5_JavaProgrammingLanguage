package day19_ReturnMethods_Overloading;

public class C09_MethodOverloading2 {

    public static void main(String[] args) {
        for (int i = 1,j=0; i<10 ; i*=2,j++) {
            System.out.println(i);
        }


    }


    public static void calculateArea(int side1, int side2) {
        System.out.println(side1 * side2);
    }

    public static void calculateArea(double side1, double side2) {
        System.out.println(side1 * side2);
    }

    public static void calculateArea(int radius) {
        System.out.println(3.14 * radius * radius);
    }

    public static void calculateArea(double radius) {
        System.out.println(3.14 * radius * radius);
    }

    public static void calculateArea(long radius) {
        System.out.println(3.14 * radius * radius);
    }

    // cannot overload with return type;access modifiers and specifier


}



/*CalculateArea isminde  method yazın ve overload
olsun. Birincisi kare-dikdörtgen alanını hesaplasın.
İkincisi dairenin alanını hesaplasın. PI: 3,14*/