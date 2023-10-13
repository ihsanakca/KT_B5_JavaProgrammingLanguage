package day40_Week08_Review.scrumTask;

public class Developer {


    public String name, jobTitle;
    public double salary;

    public int employeeID;

    public Developer(String name, String jobTitle, double salary, int employeeID) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.employeeID=employeeID;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", employeeID=" + employeeID +
                '}';
    }
}
