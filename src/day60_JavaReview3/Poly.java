package day60_JavaReview3;

public class Poly {

    public static void main(String[] args) {
//        B obj= new B();
//        obj.show();

        A obj1= new B();
        obj1.show();

        A obj2= new A();
        obj2.show();

        obj2= new B();
        obj2.show();


    }
}

class A{
    public void show(){
        System.out.println("in A");
    }

}

class B extends A{
    public void show(){
        System.out.println("in B");
    }

}
