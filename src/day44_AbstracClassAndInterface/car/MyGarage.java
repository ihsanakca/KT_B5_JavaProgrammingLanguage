package day44_AbstracClassAndInterface.car;

public class MyGarage {
    public static void main(String[] args) {


        Honda honda = new Honda("Accord", "Black", 2010, 57000);
        honda.start();
        honda.stop();


        Audi audi = new Audi("RS6", "Red", 2023, 12107677.05);
        System.out.println(audi);
        audi.start();
        audi.stop();
        audi.autoPark();
        audi.quatro();

        Togg togg = new Togg();
        System.out.println(togg);
        togg.setColor("Toros Siyahi");
        togg.setPrice(-150000);
        System.out.println(togg);

        togg.zoom();

    }
}
