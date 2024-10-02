/*Implement Multilevel Inheritance with Method Overriding
Create a base class Person.Create a subclass Employee that extends Person, and includes the methods work() and getSalary().
Create another subclass HRManager that extends Employee, overrides the work() method, and adds a new method addEmployee() to simulate adding employees.@GRS*/
package Assignment_01;

public class TestHrManager {

	public static void main(String[] args) {

		System.out.println("------------------------Using employee Object----------------------------");
		Employee employee = new Employee();
		employee.display();
		employee.work();
		employee.getSalary(20000);

		System.out.println("------------------------Using hrManager Object----------------------------");
		HRManager hrManager = new HRManager();
		hrManager.display();
		hrManager.work();
		hrManager.addEmployee();

	}

}
