package day10_Relational_LogicalOperators_Review;

public class C03_RelationalOperators {
    public static void main(String[] args) {
        // >  >=  <  <=  ==  !=
        boolean result = (60>40);
        System.out.println("result = " + result);

        boolean result1 = 25 >= 25;
        System.out.println("result1 = " + result1);

        boolean result2 = 25 >= 35;
        System.out.println("result2 = " + result2);

        System.out.println("---------------------------");

        int findexScore = 1200;

        boolean isEligibleForLoan = (findexScore>=1500);
        System.out.println("isEligibleForLoan = " + isEligibleForLoan);

        boolean result3 = 100<200;
        System.out.println("result3 = " + result3);

        boolean result4 = 300<200;
        System.out.println("result4 = " + result4);

        System.out.println("---------------------------");

        int score = 75;

        boolean hasPassed = (score>=60);
        System.out.println("hasPassed = " + hasPassed);

        boolean hasFailed= (score<=60);
        System.out.println("hasFailed = " + hasFailed);

        System.out.println("---------------------------");


        int x = 20;
        int y = 30;

        boolean isEqual =  ( x==y                       );
        System.out.println("isEqual = " + isEqual);

        boolean result5 ="Ahmet" == "Atakan";
        System.out.println("result5 = " + result5);

        boolean result6 = 'a'=='b';  // primitive
        System.out.println("result6 = " + result6);

        boolean result7 = "Java"=="Java";   // STRINGLERI KARSILASTIRMADA == OPERATORU KULLANILMAZZZZZZ!!!!!!
        System.out.println("result7 = " + result7);

        System.out.println("---------------------------");
        boolean result8 = 100!=200;
        System.out.println("result8 = " + result8);

        boolean result9 = 200!=200;
        System.out.println("result9 = " + result9);

    }
}
