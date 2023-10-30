package day51_ExceptionRecap;

import day48_OOPReview.scrumTeam.Employee;

public class C04_MultiCatch {

    public static void main(String[] args) {

        Employee employee= null;

        try {
            System.out.println(employee.getId());
        }
        catch (NullPointerException e){
            System.out.println("1st Catch");
            System.out.println(e.getMessage());
        }
        catch (RuntimeException e){
            System.out.println("2nd Catch");
            System.out.println(e.getMessage());
        }

    }
}
