package Assignment_01;

public class Employee extends Person {

	protected double salary;

	public void work() {
		System.out.println("Employee is Working.......");
	}

	public void getSalary(double salary) {
		this.salary = salary;
		System.out.println("Salary of Employee is " + salary);
	}

}
