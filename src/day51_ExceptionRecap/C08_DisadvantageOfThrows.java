package day51_ExceptionRecap;

public class C08_DisadvantageOfThrows {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Hello");

        sleep(2.1);

        System.out.println("Hello");


    }


    public static void sleep(double seconds) throws InterruptedException{
        Thread.sleep((long) seconds*1000);
    }
}
