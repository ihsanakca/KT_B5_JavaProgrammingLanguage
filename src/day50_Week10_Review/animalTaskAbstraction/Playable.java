package day50_Week10_Review.animalTaskAbstraction;

public interface Playable {

    static final boolean isFriendly= true; //default olarak static ve final
    boolean isPet=true;

    //abstract void play(); //abstract by default
    void play();


}
