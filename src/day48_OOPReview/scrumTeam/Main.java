package day48_OOPReview.scrumTeam;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Ahmet", 25, 'M');
        System.out.println(person);
        person.age = 29;
        person.name = "Ahmet Faruk";
        System.out.println(person);
        Employee employee = new Employee("Mehmet", 30, 'M', "Developer", 50000, 100001, "IT");
        System.out.println(employee);

        employee.name = "Emre";
        employee.eat("Makarna");
        employee.sleep();
        employee.work();


    }


}
