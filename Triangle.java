package Assignment2;
// Write a program to print the area and perimeter of a triangle having sidesof 3, 4 and 5 units by 
//creating a class named 'Triangle' with parameter in its constructor
public class Triangle {
	private double perimeter;
	private double area;
	private double s1,s2,s3;
	private double semiperimeter,s;
	public Triangle( double s1, double s2, double s3) {
		super();
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		this.semiperimeter=s;
	}
	public double getPerimeter() {
		perimeter=s1+s2+s3;
		return perimeter;
	}
	public double getArea() {
		area=Math.sqrt(semiperimeter * (semiperimeter - s1) * (semiperimeter - s2) * (semiperimeter - s3));
		return area;
	}
	public double getSemiperimeter() {
		semiperimeter=s1+s2+s3/2;
		return semiperimeter;
	}
	
	public void display(){
		
		System.out.println("perimeter is"+perimeter);
		System.out.println("semiperimeter is"+semiperimeter);
		System.out.println("area is "+area);
	}
	
	
}

