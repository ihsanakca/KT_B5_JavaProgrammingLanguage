package day51_ExceptionRecap;

public class C01_JavaError {

    public static void main(String[] args) {

        check(3);
    }

    public static void check(int i){
        if(i==0)
            return;
        else{
            check(i++); //recursion
        }
    }
}
