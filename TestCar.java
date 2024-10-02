package Assignment6;

public class TestCar {

	public static void main(String[] args) {
		Engine engine=new Engine("V8", 350);
		engine.displayDetails();
		Car car = new Car("Tata", "Nexon", engine);
		car.start();
		car.stop();
		car.displayEngineDetails();

	}

}
