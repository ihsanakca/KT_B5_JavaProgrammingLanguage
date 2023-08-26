package day04_variables;

public class C01_PrimitiveDataTypes {
    public static void main(String[] args){
        // age = 48 years old
        byte myAge;   // declaration

        myAge=48;     //initialization
        System.out.println(myAge);
        myAge=55;
        System.out.println("myAge");  // it will write myAge to the console
        System.out.println(myAge);

        //Weight = 95
        short myWeight = 95;  //declaration + initialization
        System.out.println(myWeight);

        System.out.println("-------------------");

        //Annual salary : $100000
        int mySalary = 100000;
        System.out.print("My Salary is ");
        System.out.println(mySalary);

        //world population
        long worldPopulation;
        worldPopulation=8_056_338_000L;   //l or L
        System.out.println(worldPopulation);

        //byte, short, int, long degiskenlerin default degerleri int

    }

}
