package Assignment2;

import java.util.Scanner;

public class Car {
	private String carModel;
	private String carName;
	private double carPrice;
	private String carOwner;

	public void setCarDetails() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Car Model: ");
		carModel = scanner.nextLine();
		System.out.print("Enter Car Name: ");
		carName = scanner.nextLine();
		System.out.print("Enter Car Price: ");
		carPrice = scanner.nextDouble();
		scanner.nextLine();
		System.out.print("Enter Car Owner: ");
		carOwner = scanner.nextLine();
	}

	public void displayCarDetails() {
		System.out.println("Car Model: " + carModel);
		System.out.println("Car Name: " + carName);
		System.out.println("Car Price: $" + carPrice);
		System.out.println("Car Owner: " + carOwner);
		System.out.println();
	}
}
