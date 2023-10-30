package day51_ExceptionRecap;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {

    public static void main(String[] args) {

        Car car1= new Car("Toyota","Camry","White",2015,20000);
        Car car2= new Car("BMW","335i","Black",2022,50000);
        Car car3= new Car("Audi","Q7","Red",2020,45000);


        ArrayList<Car> carList= new ArrayList<>();
        carList.addAll(Arrays.asList(car1,car2,car3));

        System.out.println(carList);

        //carList.removeIf(p->p.year>2020);

        //carList.removeIf(car-> car.brand.equalsIgnoreCase("toyota"));

        //carList.removeIf(s->!s.color.startsWith("R"));

        carList.removeIf(car->car.brand.equalsIgnoreCase("audi")&& car.year>2015);

        System.out.println(carList);


    }
}
