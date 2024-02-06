package day30_RANDOM_MATH_DATE_Classes;

public class C05_MathIntro {
    public static void main(String[] args) {
        // Math Class tan object olusturmak mumkun degil
        // Math math = new Math();

        // Method ve instance lara object olusturmadan , dogrudan class name ile ulasmak mumkun
        double pi = Math.PI;
        System.out.println("pi = " + pi);
        double pow = Math.pow(3.0,3.0);
        System.out.println("pow = " + pow);
        int pow2 = (int) Math.pow(3,2);
        System.out.println("pow2 = " + pow2);
        double sqrt = Math.sqrt(25);
        System.out.println("sqrt = " + sqrt);
        System.out.println(Math.round(4.5)); // long 5
        System.out.println(Math.round(4.5f)); // int 5
        System.out.println(Math.round(4.4)); // long 4
        System.out.println(Math.floor(4.9)); // double 4
        System.out.println(Math.ceil(4.1)); // double 5
        System.out.println(Math.addExact(10,20));  // 30
        System.out.println(Math.multiplyExact(3,5)); //15
        System.out.println(Math.min(50,60));  //50
        System.out.println(Math.max(50,60));  //60
    }
}
