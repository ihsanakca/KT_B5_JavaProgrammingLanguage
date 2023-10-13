package day40_Week08_Review;

public class C01_Wrapper {

    public static void main(String[] args) {

        String str="123";

        Integer num = Integer.valueOf(str);
        System.out.println(num);

        int num2 = Integer.parseInt(str);
        System.out.println("num2 = " + num2);

        String str2 = Integer.toString(num2);
        System.out.println("str2 = " + str2);
        System.out.println("str2+\"A\" = " + str2 + "A");

        double v = Double.parseDouble(str);
        System.out.println(v);


    }

}
