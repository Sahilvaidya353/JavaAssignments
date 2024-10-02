package Assignment6;

class ClassA {
	static void display() {
		System.out.println("Parent");
	}
}

class B extends ClassA {
	static void display() {
		System.out.println("Child");
	}
}

class Main {
	public static void main(String[] args) {
		
		ClassA.display();
		B.display();

		ClassA obj = new B();
		obj.display();
	}
}
