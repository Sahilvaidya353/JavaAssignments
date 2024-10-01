package Assignment2;

import java.util.Scanner;

public class TestEmployee {

    public static void main(String[] args) {
 
        Employee employee = new Employee();
        
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        System.out.print("Enter the salary of the employee: ");
        double salary = scanner.nextDouble();
        System.out.print("Enter the number of hours worked per day: ");
        float hours = scanner.nextFloat();
        
       
        employee.getInfo(name, salary, hours);
        
        employee.addSalary();
        employee.addWork();
    
        double finalSalary = employee.getFinalSalary();
        System.out.println("The final salary of " + name + " is: $" + finalSalary);

    }
}
