package day46_FinalAndHiding;

public class C extends B{
    int c=15;


    {
        System.out.println("Instance C is running");
    }
    static {
        System.out.println("static C is running");
    }
    public C(){
        System.out.println("Constructor C is running");
    }
}
