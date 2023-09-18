package day21_Class_And_Methods;

public class C03_Fibonacci {
    public static void main(String[] args) {
        fibonacci(12);
    }

    private static void fibonacci(int n) {
// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377
        int x=0;
        int y=1;
        int z;
        System.out.print(x+" ");
        System.out.print(y+" ");

        for (int i = 0; i < n-2 ; i++) {
            z=x+y;
            System.out.print(z+" ");
            x=y;
            y=z;
        }

    }

}
