package day49_Exceptions;

public class C01_ExceptionsIntro {
    public static void main(String[] args) {

    //    System.out.println(2+2);// bazen Bug olarak da adlandırılır


        int i=0;    // normal statement
        int j=0;
        try{
            j = 25 / i;
        }catch(Exception e){
            System.out.println("Something went wrong"+e);// ArithmeticException
        }
        System.out.println(j);


        System.out.println("Bye");

        // eğer i değeri 0 olursa critical statemen--- handle etmek gerekir
    }
}
