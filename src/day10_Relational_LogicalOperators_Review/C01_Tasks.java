package day10_Relational_LogicalOperators_Review;

public class C01_Tasks {
    public static void main(String[] args) {


        int i=10;
        int j=0;
        i= --i + ++i + --i + i++;
        //  9 + 10 +  9 + 9
//        System.out.println("j = " + j);
        System.out.println("i = " + i);

        i = i++ + i-- * -i++ * --i;
        //  37  + 38 * -37 *  37   // i=37

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        i=10;



        j = i++ -i++ / --i * i++;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //  10 - 11 / 11  * 11     //

    }
}
