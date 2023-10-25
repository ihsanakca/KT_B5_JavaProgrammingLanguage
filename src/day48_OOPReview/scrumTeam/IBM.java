package day48_OOPReview.scrumTeam;

import java.util.ArrayList;
import java.util.Arrays;

public class IBM {
    public static void main(String[] args) {


        String departmentName = "IBM-IT";

        ProductManager pm = new ProductManager("Hatice", 30, 'f', 60000, 100002, departmentName);
        BusinessAnalyst ba = new BusinessAnalyst("Burcu", 32, 'f', 50000, 100003, departmentName);

        ScrumMaster sm = new ScrumMaster("Ahmet", 30, 'M', 60000, 100003, departmentName);

        Tester tester1 = new Tester("Samet", 34, 'M', 60000, 100004, departmentName, "Java");
        Tester tester2 = new Tester("Emre", 24, 'M', 27000, 100005, departmentName, "Java");
        Tester tester3 = new Tester("Atakan", 34, 'M', 18000, 100006, departmentName, "Java");
        Tester tester4 = new Tester("Derya", 34, 'f', 20000, 100012, departmentName, "Java");

        ArrayList<Tester> testers = new ArrayList<>(Arrays.asList(tester1, tester2, tester3));
        Developer developer1 = new Developer("Ayse", 30, 'f', 34000, 100007, departmentName, "Phyton");
        Developer developer2 = new Developer("Fatma", 30, 'f', 50000, 100008, departmentName, "Phyton");
        Developer developer3 = new Developer("Veli", 25, 'f', 40000, 100009, departmentName, "Phyton");
        Developer developer5 = new Developer("Mustafa", 25, 'f', 36000, 1000010, departmentName, "Phyton");
        Developer developer4 = new Developer("Deniz", 25, 'f', 38000, 100011, departmentName, "Phyton");
        Developer developer6 = new Developer("Kemal", 25, 'M', 38000, 100014, departmentName, "Phyton");


        ArrayList<Developer> developers = new ArrayList<>(Arrays.asList(developer1, developer2, developer3, developer4, developer5));
        ScrumTeam scrumTeam = new ScrumTeam(pm, ba, sm, testers, developers);

        System.out.println(scrumTeam);

        scrumTeam.addTester(tester4);
        scrumTeam.addDeveloper(developer6);

        System.out.println(scrumTeam);

        System.out.println("--------------------------------");
        for (Developer developer : scrumTeam.developers) {
            System.out.println(developer.name);
            developer.eat("Steak");
            System.out.println(developer.jobTitle);
        }


    }
}
