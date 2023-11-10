package day60_JavaReview3.carTask04_abstraction_polymorphism;

public class Airplane implements AutoPilot{
    @Override
    public void autoPilot() {
        System.out.println("airplane is in autopilot mode");
    }
}
