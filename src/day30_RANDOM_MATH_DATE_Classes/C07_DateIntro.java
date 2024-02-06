package day30_RANDOM_MATH_DATE_Classes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class C07_DateIntro {
    public static void main(String[] args) throws InterruptedException {
        Date date = new Date();
        long time = date.getTime();
        //Unix zaman damgası
        System.out.println("time = " + time);
        System.out.println("date = " + date);


        Date date2 = new Date();
        long time2 = date2.getTime();
        System.out.println("time2 = " + time2);

        LocalDate myObj = LocalDate.now();
        System.out.println("myObj = " + myObj);

        LocalTime myObj2 = LocalTime.now();
        System.out.println("myObj2 = " + myObj2);

        LocalDateTime myObj3 = LocalDateTime.now();
        System.out.println("myObj3 = " + myObj3);

        System.out.println(myObj.getYear());
        System.out.println("myObj = " + myObj.getDayOfMonth());
    }
}
