package day48_OOPReview.scrumTeam;

public class Employee extends Person {


    public String jobTitle;

    private double salary;

    private int id;


    public String departmentName;

    public Employee(String name, int age, char gender, String jobTitle, double salary, int id, String departmentName) {
        super(name, age, gender);
        this.jobTitle = jobTitle;
        setSalary(salary);
        this.id = id;
        this.departmentName = departmentName;
    }

//    public double getSalary() {   //TopSecret
//        return salary;
//    }

    public void setSalary(double salary) {
        if (salary < 15000) {
            System.err.println("Not Enough Salary");
        } else {
            this.salary = salary;
        }

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void work() {
        System.out.println(jobTitle + " " + name + " is working");
    }


    @Override
    public String toString() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", id=" + id +
                ", departmentName='" + departmentName + '\'' +
                "} " + super.toString();
    }
}
