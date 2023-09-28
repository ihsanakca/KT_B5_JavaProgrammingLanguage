package day29_FullReview;

public class C02_CustomMethodsReturn {

    public static void main(String[] args) {

        System.out.println("ageOfPerson(1987) = " + ageOfPerson(1987));
        if (isEven(10)) {
            System.out.println("Number is an even number");
        }

        System.out.println("numbersInRange(1,50) = " + numbersInRange(1, 50));

    }

    // create a function that can check if a number is odd number or even number
    // 1.23   1 int parametre tipi belirle

    /**
     * This method returns true if the number is even
     * @param number
     * @return
     */
    public static boolean isEven(int number) {
        boolean result = false;
        if (number % 2 == 0) {
            result = true;
        }
        return result;
    }

    /**
     * This function returns the age of the person
     * @param birthYear
     * @return
     */
    public static int ageOfPerson(int birthYear) {
        int result;
        result = 2023 - birthYear;
        return result;
    }

    //create a function that can return all the numbers between X and Y

    /**
     * this function returns all the numbers between X and Y as a String
     * @param x
     * @param y
     * @return
     */
    public static String numbersInRange(int x, int y ){
        String result="";
        for (int i = x+1; i < y; i++) {
            result+=i+" ";
        }

        return result;
    }





}
// create a function that can return the age of the person


