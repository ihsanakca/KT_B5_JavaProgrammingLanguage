package day50_Week10_Review;

public interface PropertiesOfInterface {

    final static int c=15;
    static int b=10;
    final int d=5;
    int a=14;
    int e=6;


//    public PropertiesOfInterface(){ // no constructor in Interface
//
//    }


//    static{ // no blocks in Interface
//        e=100;
//    }

//    public void method1(){ // no instance methods in Interface
//        System.out.println("Instance method");
//    }

    static void method2(){
        System.out.println("static method");
    }

    abstract void method3(); //abstract method : abstract by default --->

    default void method4(){
        System.out.println("default method");
    }

class Test implements PropertiesOfInterface{


    @Override
    public void method3() {

    }

    public static void main(String[] args) {
        Test test= new Test();
        test.method3();
        test.method4(); //default method---> instance method gibi obje ile çağırabiliriz.

    }
}









}
