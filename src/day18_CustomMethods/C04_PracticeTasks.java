package day18_CustomMethods;

public class C04_PracticeTasks {


    public static void main(String[] args) {

        double boyaUcreti=0;
        boyaUcreti = areaOfCircle(2) * 3 * 150;
        System.out.println("boyaUcreti = " + boyaUcreti);
        System.out.println("--------------------------------");

        int a=5;
        System.out.println("areaOfSquare(a) = " + areaOfSquare(a));

        System.out.println("-------------------------------");

        //Bahcemin kenarina 3 sira tel cekicem
        double gerekenTelMiktari = perimeterOfSquare(150) * 3;
        System.out.println("gerekenTelMiktari = " + gerekenTelMiktari);


    }
    /**
     * this method calculates the area of a circle with given radius
     * @param radius
     * @return
     */
    public static double areaOfCircle(int radius){
        double area;
        area = Math.PI * Math.pow(radius,2);
        System.out.println(area);
        return area;
    }

    /**
     * method that can calculate the area of a square
     * @param side
     * @return
     */
    public static double areaOfSquare(int side){
        return side*side;
    }

    public static double perimeterOfSquare(int side){
        return 4*side;
    }



}
//	create a method that can calculate the area of a circle Pi*r*r
//	create a method that can calculate the area of a square

