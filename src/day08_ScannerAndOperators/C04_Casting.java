package day08_ScannerAndOperators;

public class C04_Casting {
    public static void main(String[] args) {

        float bodyTemperature = 36.5F;

        byte num1 = (byte)bodyTemperature; // explicit, narrowing, manual
        short num2 = (short) bodyTemperature; // explicit, narrowing, manual
        int num3 = (int) bodyTemperature; // explicit, narrowing, manual
        long num4 = (long)bodyTemperature; // explicit, narrowing, manual
        float num5 = bodyTemperature; // no casting
        double num6 = bodyTemperature;   //implicit, widening, automatic casting


        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);




    }
}

// ctrl+d
//implicit casting: casting smaller type to larger
// explicit casting: casting the larger type to smaller