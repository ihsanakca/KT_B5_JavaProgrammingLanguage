package day40_Week08_Review.scrumTask;

public class MyScrumTeam {

    public static void main(String[] args) {

        Developer developer1= new Developer("Atakan","Full-stack",5000,101);
        Developer developer2= new Developer("Hatice","Back-End",4000,102);
        Developer developer3= new Developer("Osman","Front-End",3500,103);


        System.out.println(developer1);
        System.out.println(developer2);
        System.out.println(developer3);

        System.out.println(developer1.name);
        System.out.println(developer2.salary);
        System.out.println(developer1.jobTitle);

        ScrumTeam scrumTeam1= new ScrumTeam("Samet","Ahmet","Huseyin");

        scrumTeam1.addDeveloper(developer1);
        scrumTeam1.addDeveloper(developer2);

        System.out.println(scrumTeam1);

        ScrumTeam scrumTeam2= new ScrumTeam("Samet","Ahmet","Ayşe");
        scrumTeam2.addDeveloper(developer3);
        System.out.println(scrumTeam2);

    }
}
