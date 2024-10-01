package Assignment2;

public class TestCar {

	public static void main(String[] args) {
		Car[] cars = new Car[3];

		for (int i = 0; i < cars.length; i++) {
			System.out.println("Enter details for Car " + (i + 1) + ":");
			cars[i] = new Car();
			cars[i].setCarDetails();
		}

		System.out.println("\nCar Details:");
		for (Car car : cars) {
			car.displayCarDetails();
		}

	}

}
