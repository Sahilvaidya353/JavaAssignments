package Assignment_01;

public class Area {

	public void printArea(double side) {
		double area = side * side;
		System.out.println("Area of Square: " + area);

	}

	public void printArea(double length, double breadth) {
		double area = length * breadth;
		System.out.println("Area of Rectangle: " + area);

	}

	public void printPeri(double side) {
		double peri = 4 * side;
		System.out.println("Perimeter of Square: " + peri);

	}

	public void printPeri(double length, double breadth) {
		double peri = 2 * (length * breadth);
		System.out.println("Perimeter of Square: " + peri);

	}

}
