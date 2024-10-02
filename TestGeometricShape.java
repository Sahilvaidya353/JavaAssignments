package Assignment6;

abstract class GeometricShape {
	final double PI = 3.14;

	abstract public double area();

	abstract public double perimeter();
}

class Circle extends GeometricShape {
	private int r;

	public Circle(int radius) {
		this.r = radius;
	}

	@Override
	public double area() {
		return PI * r * r;
	}

	@Override
	public double perimeter() {
		return 2 * PI * r;
	}
}

class Triangle extends GeometricShape {
	private int a, b, c;
	private int height;

	public Triangle(int a, int b, int c, int height) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.height = height;
	}

	@Override
	public double area() {
		return 0.5 * b * height;
	}

	@Override
	public double perimeter() {
		return a + b + c;
	}
}

public class TestGeometricShape {
	public static void main(String[] args) {
		Circle circle = new Circle(5);
		Triangle triangle = new Triangle(3, 4, 5, 4); // sides and height

		System.out.println("Circle: Area ="+ circle.area());
		System.out.println("Circle Perimeter="+circle.perimeter());
		System.out.println("triangle area="+triangle.area());
		System.out.println("triangle perimeter"+triangle.perimeter());
	}
}
