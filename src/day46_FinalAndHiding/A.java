package day46_FinalAndHiding;

public class A {
    int a=4;

    {
        System.out.println("Instance A2 is running");
    }
    static {
        System.out.println("static A1 is running");
    }
    {
        System.out.println("Instance A1 is running");
    }
    public A(){
        System.out.println("Constructor A is running");
    }

public  void method(){
    System.out.println("ahmet");
}

}
