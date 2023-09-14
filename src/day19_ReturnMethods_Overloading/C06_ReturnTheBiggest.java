package day19_ReturnMethods_Overloading;

public class C06_ReturnTheBiggest {

    public static void main(String[] args) {
        System.out.println("biggerNumber(3,-5) = " + biggerNumber(3, -5));
    }

    public static int biggerNumber(int number1, int number2 ){
        return number1>number2 ? number1 : number2;
        //       condition  ?   option1  : option2
    }

}



//a method that returns the biggest number of two numbers
