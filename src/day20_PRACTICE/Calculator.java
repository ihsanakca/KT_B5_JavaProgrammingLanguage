package day20_PRACTICE;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("calculator(3,6,'+') = " + calculator(3, 6, '+'));
        System.out.println("calculator(3,6,'/') = " + calculator(3, 6, '/'));
        System.out.println("calculator(3,6,'/') = " + calculator(3, 6, 'd'));
    }

    public static double calculator(double x, double y, char operator) {
        double result;
        switch (operator) {
            case '+':
                result = x + y;
                break;
            case '-':
                result = x - y;
                break;
            case '*':
                result = x * y;
                break;
            case '/':
                result = x / y;
                break;
            default:
                System.out.println("erroneous operation");
                result=0;
        }
        return result;
    }
}
