package day20_Week04_Review;

public class C07_AreaOfSquare {

    /*
create a method that can calculate the area of a square
karenin alanını hesaplayabilecek bir metot oluştur
 */
    public static void main(String[] args) {

        areaOfTheSquare();
        areaOfTheSquare(8.5);
        areaOfTheSquare(6.4);
        System.out.println(areaOfSquare());
        System.out.println("areaOfSquare(9.6) = " + areaOfSquare(9.6));
        double area = areaOfSquare(9.6);
        System.out.println(area);

    }


    public static void areaOfTheSquare() { // void without parameters
        double side = 7.5;
        double area = side * side;
        System.out.println("area = " + area);

    }

    public static void areaOfTheSquare(double side) { // void with parameters
        double area = side * side;
        System.out.println("area = " + area);

    }

    public static double areaOfSquare() { // return without parameters
        double side = 7.0;
        double area = side * side;
        return area;

    }

    public static double areaOfSquare(double side) { // return with parameters

        return side * side;

    }

}
