package day48_OOPReview.scrumTeam;

public class Tester extends Employee implements DevTeam {
    public String programmingLanguage;

    public Tester(String name, int age, char gender, double salary, int id, String departmentName, String programmingLanguage) {
        super(name, age, gender, "Tester", salary, id, departmentName);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void coding() {
        System.out.println(jobTitle + " " + name + " is writing automations with " + programmingLanguage);
    }

    public void createTicket() {
        System.out.println(jobTitle + " " + name + " is finding bugs");
    }
}
