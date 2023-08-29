package day06_Concat_TypeCasting;

public class C03_WideningCasting {
    public static void main(String[] args) {
        // byte <  short  <  int   < long <  float  <  double

        byte b=5;
        short sh=45;

        sh=b;  // byte tipindeki bir değeri short içine attık
                // java otomatik olarak değeri dönüştürdü

        System.out.println(sh);


        int i=14;

        i=sh;  // widening casting
        System.out.println(i);


        long l=54545465;

        l=i;  // widening casting

        System.out.println(l);

        float f=2.5f;
        double d=5.6;

        d=f;  // widening casting  otomatik olarak java tarafından yapılır.

        System.out.println(d);

    }

}
