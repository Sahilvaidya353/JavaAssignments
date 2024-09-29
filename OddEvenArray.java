package Array;

import java.util.Scanner;

public class OddEvenArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int even = 0;
		int odd = 0;
		for (int num : a) {
			if (num % 2 == 0)
				even++;
			else
				odd++;
		}
		System.out.println("Even number count in array element" + even);
		System.out.println("Odd number count in array element" + odd);

	}

}
