package day36_WrapperClasses;

public class C02_WrapperClass_Methods {
    public static void main(String[] args) {
        // valueOf()  int ve string değer kabul eder -- çağrıldığı methoda göre değer döndürür

        String s="123";
       // System.out.println(s*3);  bunu kabul etmez
        System.out.println("Integer.valueOf(s) = " + Integer.valueOf(s,4));
        Integer s1=Integer.valueOf(s);
        Integer x = Integer.valueOf(123);     // Integer döndürür ve objedir
        System.out.println("x = " + x);
        System.out.println(x*2);

        double y = Double.valueOf(s);// auto unboxing
        System.out.println( y+10);


        // parseInt()  string bir değer ve int döndürür primitive
        int i  = Integer.parseInt(s);  // primitive data döndürür
        System.out.println("i = " + i);


        Integer num1 = Integer.valueOf("123");
        int num2 = num1.intValue();
        System.out.println("num2 = " + num2);


        String str1="Bugün hava 25 derece";
        // hava sıcaklığı 10 derece daha artarsa sıcaklık kaç derece olur?

        String[] strArray = str1.split(" ");
        System.out.println( strArray[2]);

        int result = Integer.parseInt(strArray[2])+10;
        System.out.println("result = " + result);
        System.out.println("Bugun hava sıcaklığı "+ result+ " derecedir.");


        String str="Bugün hava 40 derece;Bugün hava mevsim normallerinde";

        // 40 derece ve üzerinde bir hava sıcaklığı varsa "Bugün hava çok sıcak
        // altında ise "Bugün hava mevsim normallerinde"


        String strHavaSicaklıgı = str.split(" ")[2];
        int havaSicakligi = Integer.parseInt(strHavaSicaklıgı);



        String expectedResult1="Bugün hava çok sıcak";
        String expectedResult2="Bugün hava mevsim normallerinde";

        String actualResult= str.split(";")[1];

        if (havaSicakligi>=40){
            System.out.println(expectedResult1.equalsIgnoreCase(actualResult));
        }else {
            System.out.println(expectedResult2.equalsIgnoreCase(actualResult));
        }







        //"Ali'nin doğum yılı 1996" ise 10 yıl sonra ali kaç yaşında olur?


        String strName="Ali'nin doğum yılı 1996";
        String[] strArrayName = strName.split("'");
        String name = strArrayName[0];
        String yil = strArrayName[1].split(" ")[3];// "nin doğum yılı 1996"
        String yil2 = strName.split(" ")[3];

        System.out.println("yil = " + yil);
        int onyilSonrakiYas = 2023-Integer.parseInt(yil2) + 10;
        System.out.println(name+" "+ onyilSonrakiYas+ " yaşında olur.");

    }
}
