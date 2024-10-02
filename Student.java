/*Create a class 'Student' with three data members which are name, age and address.
The constructor of the class assigns default values name as "unknown", age as '0' and address as "not available".
It has two Members with the same name 'setInfo'. First method has two parameters for name and age and assigns the same whereas 
the second method takes has three parameters which are assigned to name, age and address respectively. Print the name, age and address of 10 students.
Hint-Use array of objects.
@GRS*/
package Assignment_01;

public class Student {

	String name;
	int age;
	String address;

	public Student() {
		this.name = "Unknown";
		this.age = 0;
		this.address = "Not Avilable";
	}

	public void setInfo(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void setInfo(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public void print() {
		System.out.println("Name: " + name + ", Age: " + age + ", Address: " + address);
	}

	public static void main(String[] args) {

		Student[] student = new Student[5];

		for (int i = 0; i < student.length; i++) {
			student[i] = new Student();
		}

		student[0].setInfo("Girish", 22, "Govind nagar Nashik");
		student[1].setInfo("Ram", 23);
		student[2].setInfo("Krishna", 19, "12-c Vrindawan");
		student[3].setInfo("Hari",56, "Rameshwar Colony");
		student[4].setInfo("Shiv",11,"Rampur Maharashtra");

		for (Student student1 : student) {
			student1.print();
		}
	}
}
