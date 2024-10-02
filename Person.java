package Assignment6;

public class Person {
	final String name;
	final int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;

	}

	public String getName() {
		System.out.println("The name is" + name);
		return name;
	}

	public String setName(String name) {
		System.out.println("The name is" + name);
		return name;
	}

	public String setAge(int age) {
		System.out.println("The name is" + name);
		return name;
	}

	public int getAge() {
		System.out.println("The age is " + age);
		return age;
	}

	public static void main(String[] args) {
		Person person = new Person("sahil", 24);
		person.getName();
		person.getAge();
		System.out.println("values cannot be changed");
		//person.setAge();
		//person.setName();
	}

}
