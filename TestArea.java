/* Create a class to print the area of a square and a rectangle.
The class has two methods ‘printArea’ and ‘printPerimeter’ with the same name but different number of parameters. 
The method for printing area of Rectangle has two parameters which are length and breadth respectively while the other method for printing area of square has one parameter which is side of square.@GRS*/
package Assignment_01;

public class TestArea {

	public static void main(String[] args) {
		Area area = new Area();
		area.printArea(12);
		area.printArea(8, 7);

		System.out.println("------------------------------------------");

		area.printPeri(9);
		area.printPeri(4, 5);
	}

}
