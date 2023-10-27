package day50_Week10_Review;

public class B {

    public String name;

    private String surname; // not inherited-- no direct reach-- getter&setter

    public void talk() {
        System.out.println(name + " is talking");
    }

    public static void noWalk() {
        System.out.println("not walking");
    }

    public final void noEat() {
        System.out.println(name + " is not eating");
    }

    private void secretTalk() {
        System.out.println(name + " is talking a secret topic");
    }

    @Override
    public String toString() {
        return "B{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}

class A extends B {
    public int age;

    @Override
    public void talk() {
        System.out.println(name + "with" + age + " age  talking");
    }
//    @Override
//    public static void noWalk() { // static method can not be overridden
//        System.out.println("not walking");
//    }

//        public final void noEat() { //final method can not be overridden
//        System.out.println(name + " is not eating");
//    }
//    @Override
//    private void secretTalk() { // private method can not be overridden
//        System.out.println(name + " is talking a secret topic");
//    }

    public void noTalk(){
        System.out.println(name+ " is not talking");
    }

}

class Main {

    public static void main(String[] args) {
        B objB = new B();
        A objA = new A();

        System.out.println(objB.name);
        System.out.println(objA.name);
        System.out.println(objA.age);

        objB.talk();
        objB.noWalk();
        objB.noEat();
        //objB.secretTalk();
        //objB.noTalk();


        objA.talk();
        objA.noWalk();
        //objA.noEat();
        //objA.secretTalk();
        objA.noTalk();


    }
}
