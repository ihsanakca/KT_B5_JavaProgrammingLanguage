package day05_Week01_Review;

public class C07_Concatenation {

    public static void main(String[] args) {
        // String değişken tanımla
        // Birleştir

        String firstName="Ahmet";
        String lastName="Tanış";

        String fullName=firstName+" "+lastName;
        System.out.println("fullName = " + fullName);

        int i=5;
        int i1=9;
        int toplam=i1+i;

        System.out.println("toplam = " + toplam);
        System.out.println(i+i1);
        System.out.println(firstName+lastName);


        System.out.println(i+i1+firstName);
        System.out.println(i+i1+fullName+i+i1);


    }
}
