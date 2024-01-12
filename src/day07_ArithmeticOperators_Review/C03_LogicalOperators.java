package day07_ArithmeticOperators_Review;

public class C03_LogicalOperators {
    public static void main(String[] args) {

        // & && AND operatörü: true olması için bütün şartların true olması gerekir

        System.out.println((2 < 3) & (5 == 5) & (7 > 6));  //true
        System.out.println((2 < 3) && (5 == 5) && (7 > 6) & (8 != 8));  //false

        // | || OR operatörü: true olması için en az bir şartın true olması gerekir

        System.out.println((2 > 3) || (5 == 'f') | (true));  //true
        System.out.println((2 > 3) || (5 == 'f') | (6 >= 8));  //false
    }
}
