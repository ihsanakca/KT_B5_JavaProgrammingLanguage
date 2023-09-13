package day18_CustomMethods;

public class C01_CustomMethod {


    public static void main(String[] args) {
        System.out.println("Program has started");
        greetings();
        greetings();
        greetings();
        warmGreetings();
        String s = greetingsWithReturnType();
        System.out.println(s);
        System.out.println("Math.max(2,3) = " + Math.max(2, 3));
        C02_CustomMethodsPractice.helloWorld5Times();
        C02_CustomMethodsPractice.evenNumbers();
//        C02_CustomMethodsPractice.countdownTenToZero();

    }

    //Declaration
    public static void greetings(){
        System.out.println("Hello World!");
    }

    //Declaration
    public static void warmGreetings(){
            greetings();  // call the method()
        System.out.println("what's up guys!");
    }

    public static String greetingsWithReturnType(){
        String greetings="The secret of the Life is : !"; // Declare a string variable
        return greetings; // return  strin data type
    }



}