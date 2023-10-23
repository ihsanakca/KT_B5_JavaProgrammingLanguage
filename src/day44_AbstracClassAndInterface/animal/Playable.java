package day44_AbstracClassAndInterface.animal;

public interface Playable {
    boolean isFriendly = true; // static & final

    public static void method1(){
        System.out.println("isFriendly = " + isFriendly);
    }

    void play();//abxtract method by default  // must be overritten

}
