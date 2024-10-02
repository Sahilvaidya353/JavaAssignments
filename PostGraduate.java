/* Create a class 'Degree' having a method 'getDegree' that prints"I got a degree". It has two subclasses namely 'Undergraduate' and
Postgraduate'each having a method with the same name that prints"I am an Undergraduate" and "I am a Postgraduate" respectively.
Call the method by creating an object of each of the three classes.@GRS*/
package Assignment_01;

class Degree {

	public void getDegree() {
		System.out.println("I got Degree....");
	}
}

class Undergraduate extends Degree {

	public void getDegree() {
		System.out.println("I am an Undergraduate.....");
	}

}

public class PostGraduate extends Undergraduate {

	public void getDegree() {
		System.out.println("I am an Postgraduate....");
	}

	public static void main(String[] args) {
		System.out.println("-----------------------Object of Degree class-----------------------");
		Degree degree = new Degree();
		degree.getDegree();

		System.out.println("-----------------------Object of UnderGraduate class-----------------------");
		Undergraduate undergraduate = new Undergraduate();
		undergraduate.getDegree();

		System.out.println("-----------------------Object of PostGraduate class-----------------------");
		PostGraduate postGraduate = new PostGraduate();
		postGraduate.getDegree();

	}

}
