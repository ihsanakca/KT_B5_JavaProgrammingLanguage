package day29_FullReview;

public class C01_CustomMethodsVoid {

    public static void main(String[] args) {


        oddOrEven(5);
        printNumbers(10,20);
        ageOfPerson(1987);
    }

    /**
     *  this function checks if a number is odd or even number
     * @param num
     */
    public static void oddOrEven(int num){
        if(num%2==0){
            System.out.println(num+" is an Even number");
        }else {
            System.out.println(num+" is an Odd number");
        }
    }

    /**
     * //this function displays the age of the person
     * @param birthYear
     */
    public static void ageOfPerson(int birthYear){
        int result;
        result= 2023 - birthYear;
        System.out.println("Your age is "+result);
    }

    /**
     * this function prints all the numbers between X and Y
     * @param x
     * @param y
     */
    public static void printNumbers(int x, int y){
        for (int i=x+1; i<y;i++){
            System.out.print(i+" ");
        }
    }
}
