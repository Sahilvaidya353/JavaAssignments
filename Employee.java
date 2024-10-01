package Assignment2;

public class Employee {
	private String ename;
	private double salary;
	private float hours;

	public void getInfo(String ename, double salary, float hours) {
		this.ename = ename;
		this.salary = salary;
		this.hours = hours;
	}

	public void addSalary() {
		if (salary < 500) {
			salary += 10;
		}
	}

	public void addWork() {
		if (hours > 6) {
			salary += 5;
		}
	}
	public double getFinalSalary() {
        return salary;
    }

}
