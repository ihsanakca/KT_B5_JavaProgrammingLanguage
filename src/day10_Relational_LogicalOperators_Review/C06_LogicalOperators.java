package day10_Relational_LogicalOperators_Review;

public class C06_LogicalOperators {
    public static void main(String[] args) {

        String name ="Tugba";
        int age = 34;
        String citizenship = "Turkish";

        //18+, Turkish
        //age>=18


        boolean isEligibleToVote = citizenship.equals("Turkish") && age>=18;
        //        citizenship =="Turkey";   // Stringlerin esitligini == operatoru ile kontrol etmeyiniz.
        //citizenship.equals("Turkey");
        System.out.println(name+ " is eligible to vote : "+isEligibleToVote);

        System.out.println("--------------------------------");

        String name2 = "Yusuf";
        int findexScore = 800;
        int age2 = 29;
        int income = 40000;


        // findexScore >1100
        // income >=25000
        // age >=18    age <70

        boolean isEligibleForLoan = age2>=18 && age2<70 && findexScore>=1100 && income >=25000;
        System.out.println(name2+" is eligible for loan from BankOfJava : "+isEligibleForLoan);

        System.out.println("-----------------------------------");
        String name3 = " Amber";
        int age3 = 20;
        char gender = 'F'; // Male Female

        boolean isEligibleToBuyAlcohol = age3 >=21 && ( gender =='M'  || gender =='F');
        //                             =    true   && (   true  ||  false)
        //                             =    true   &&  true
        //                             =    true

        System.out.println(name3+" is eligible to buy Alcohol : "+isEligibleToBuyAlcohol);

        System.out.println("-----------------------------------");

        String studentName = "Dincer";
        double gpa = 3.0;
        int familyIncome = 15000;

        boolean isEligibleForScolarship = gpa >=3.5  || familyIncome<20000;
        System.out.println(studentName+" is eligible for scholorship : "+isEligibleForScolarship);

        System.out.println("-----------------------------------");

        boolean result1= true;
        System.out.println("result1 = " + result1);
        System.out.println("!result1 = " + !result1);

        System.out.println("-----------------------------------");

        int examScore = 55;

        boolean isPassed = examScore >= 60; //
        boolean isFailed = !isPassed;

        System.out.println("isPassed = " + isPassed);
        System.out.println("isFailed = " + isFailed);


    }
}
