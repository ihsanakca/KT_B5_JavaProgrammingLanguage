package day25_Week05_Review;

public class C01_Initials {
    /*
    write a program that can return the initials of the user

            ex:
                mustafa
                sandal

            output:
                M.S

        Note: Pay attention to the example output
     */

    public static void main(String[] args) {

        String str = "mustafa sandal";
//        String str2= "sandal";

//        Scanner scanner= new Scanner(System.in);
//        System.out.println("küçük harfle bir isim giriniz");
//        String str = scanner.nextLine();
//        System.out.println("küçük harfle bir isim giriniz");
//        String str2 = scanner.nextLine();


        str = str.toUpperCase();
        char ch1 = str.charAt(0);
        String str2 = str.substring(str.indexOf(" ")+1);
        System.out.println("str = " + str);
        char ch2 = str2.charAt(0);

        System.out.println(str2);

//        str2 = str2.toUpperCase();

//        char ch1 = str.toUpperCase().charAt(0);
//        char ch2 = str2.toUpperCase().charAt(0);

        System.out.println("(ch1+\".\"+ch2) = " + (ch1 + "." + ch2));
    }
}
