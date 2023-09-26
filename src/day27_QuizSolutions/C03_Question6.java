package day27_QuizSolutions;

public class C03_Question6 {
    public static void main(String[] args) {
        sum( 10, 20 );
        sum( 10.0, 20.0 );
    }
    public static void sum(double x, double y) {
        System.out.println("double sum is "+(x+y));
    }
    public static void sum(float x, float y) {
        System.out.println("float sum is "+(x+y));
    }
    public static void sum(int x, int y) {
        System.out.println("int sum is "+(x+y));

    }
}
