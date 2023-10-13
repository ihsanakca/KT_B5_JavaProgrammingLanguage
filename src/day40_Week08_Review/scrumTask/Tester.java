package day40_Week08_Review.scrumTask;

public class Tester {

    public String name, jobTitle;
    public double salary;

    public int employeeID;

    public Tester(String name, String jobTitle, double salary, int employeeID) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.employeeID = employeeID;
    }

    @Override
    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", employeeID=" + employeeID +
                '}';
    }
}
