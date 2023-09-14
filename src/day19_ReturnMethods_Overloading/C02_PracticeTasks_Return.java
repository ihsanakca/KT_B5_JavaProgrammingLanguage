package day19_ReturnMethods_Overloading;

public class C02_PracticeTasks_Return {

    public static void main(String[] args) {

        System.out.println("oddNumbers() = " + oddNumbers());
        System.out.println("---------------------");
        System.out.println("evenNumbers() = " + evenNumbers());
        System.out.println("---------------------");
        if(isEligibleToBuyAlhocol(23)){
            System.out.println("Ne vereyim abimee...");
        }else {
            System.out.println("De get...");
        }
        System.out.println("---------------------");
        System.out.println("areaOfCircle(5) = " + areaOfCircle(5));
        System.out.println("perimeterOfCircle(5) = " + perimeterOfCircle(5));

    }

    /**
     * this method returns to the odd numbers btw 1-100
     * @return
     */
    public static String oddNumbers(){
        String result="";
        for (int i = 1; i <=100 ; i+=2) {
            result+=i+" "; // result = result + i +" ";
        }

        return result;
    }

    /**
     * this method returns to the even numbers btw 1-100
     * @return
     */
    public static String evenNumbers(){
        String result="";
        for (int i = 2; i <=100 ; i+=2) {
            result+=i+" "; // result = result + i +" ";
        }

        return result;
    }

    //	3. create a method that can check if a person is eligible to buy alcohol

    public static boolean isEligibleToBuyAlhocol(int age){
        boolean isEligible=false;
        if(21<=age){
            isEligible=true;
        }else {
            isEligible=false;
        }

        return isEligible;
    }

    //	6. create a method that can calculate the area of a circle

    /**
     * method returns the area of a circle with given radius
     * @param radius
     * @return
     */
    public static double areaOfCircle(int radius){
      double area;
      area = (3.14) *radius*radius;
      return area;

    }

    /**
     * method returns the perimeter of a circle with given radius
     * @param radius
     * @return
     */
    public static double perimeterOfCircle(int radius){
        double perimeter;
        perimeter = 2*(3.14) *radius;
        return perimeter;

    }

    /**
     * method returns the area of a square with given side
     * @param side
     * @return
     */
    public static int areaOfSquare(int side){
        int area;
        area = side*side;
        return area;

    }



}
//	1. create a method that can print odd numbers between 1~100 in a same line saperated by space
