package Assignment2;

public class Matrix {
	private int rows;
	private int cols;
	private int[][] elements;

	public Matrix(int rows, int cols) {
		this.rows = rows;
		this.cols = cols;
		elements = new int[rows][cols];
	}

	public int getRows() {
		return rows;
	}

	public int getCols() {
		return cols;
	}

	public void setElement(int i, int j, int value) {
		if (i >= 0 && i < rows && j >= 0 && j < cols) {
			elements[i][j] = value;
		} else {
			System.out.println("Index out of bounds");
		}
	}

	public Matrix add(Matrix other) {
		if (this.rows != other.rows || this.cols != other.cols) {
			System.out.println("Matrices cannot be added");
		}

		Matrix result = new Matrix(this.rows, this.cols);
		for (int i = 0; i < this.rows; i++) {
			for (int j = 0; j < this.cols; j++) {
				result.setElement(i, j, this.elements[i][j] + other.elements[i][j]);
			}
		}
		return result;
	}

	public void display() {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(elements[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		Matrix matrix1 = new Matrix(2, 2);
		Matrix matrix2 = new Matrix(2, 2);

		matrix1.setElement(0, 0, 1);
		matrix1.setElement(0, 1, 2);
		matrix1.setElement(1, 0, 3);
		matrix1.setElement(1, 1, 4);

		matrix2.setElement(0, 0, 5);
		matrix2.setElement(0, 1, 6);
		matrix2.setElement(1, 0, 7);

		System.out.println("Matrix 1:");
		matrix1.display();

		System.out.println("Matrix 2:");
		matrix2.display();
		Matrix result = matrix1.add(matrix2);

		if (result != null) {
			System.out.println("Result of addition:");
			result.display();
		}
	}
}
