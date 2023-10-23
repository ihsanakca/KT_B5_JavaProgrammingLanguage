package day46_FinalAndHiding;

public class B extends A{
    int b=12;

    {
        System.out.println("Instance B is running");
    }
    static {
        System.out.println("static B is running");
    }

    public B(){

        System.out.println("Constructor B is running");
    }

    public void method(){

    }

}
