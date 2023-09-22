package day25_Week05_Review;

public class C06_EmailDomain {

    public static void main(String[] args) {

        String str= "Mustafa.Sandal@gmail.com"; //output: gmail
        String str2="aliveli@yahoo.com"; // yahoo

        System.out.println(str.indexOf("@"));

        str= str.substring(str.indexOf("@")+1,str.lastIndexOf(".") );
        str2= str2.substring(str2.indexOf("@")+1,str2.lastIndexOf(".") );

        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);



    }
}
