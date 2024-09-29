package Array;

import java.util.Arrays;
import java.util.Scanner;

//reverse array elements
public class ReverseArray {

	public static void main(String[] args) {
		int a[] = new int[5];
		Scanner r = new Scanner(System.in);
		System.out.println("Enter the elements in array");
		for (int i = 0; i < 5; i++) {
			a[i] = r.nextInt();
		}
		for (int i = 0; i < 5; i++) {
			System.out.print(a[i] + " ");
		}
		int temp;
		int i = a.length - 1;
		int j = 0;
		while (i > j) {
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i--;
			j++;
		}
		System.out.print(Arrays.toString(a));

	}
}