package day36_WrapperClasses;

public class C00_VarArgs {
    public static void main(String[] args) {
        sum(5,10);
        sum(5,10,15);
        sum(7,10,15,23,36);
        sum(2,36,36,32,333,25,21,25,26,3,32,3666);
//        System.out.println(concat1("ja", "va"));
//        System.out.println(concat1("ja", "va", " ", "insanları"));
//        System.out.println(concat1("ders ", "cok ", "sıkıcı"));
        System.out.println(concat1("ders ", "cok ", "sıkıcı"));

        int [] nums = {8,32,65,33,254};
        sum(nums);

    }
    public static void sum(int...sayilar){
        System.out.println(sayilar.length);
        System.out.println(sayilar[0]);
        System.out.println(sayilar);
        int sum=0;
        for (int i:sayilar) {
            sum+=i;
        }
        System.out.println(sum);
        System.out.println("Girilen "+sayilar.length+" sayının toplamı : "+sum);
    }
    public static String concat1(String...strs){
        String empty="";

        for (int i = 0; i <strs.length ; i++) {
            empty+=strs[i];

        }
        System.out.println(empty);
        return empty;
    }
}
