package Array;

import java.util.Scanner;

public class ArrayFebonaccii {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		int i,arr[]=new int[n];
		arr[0]=0;
		arr[1]=1;
		for(i=2; i<n; i++) {
			System.out.println(arr[i]=arr[i-1]+arr[i-2]);
		}
		System.out.println(n+"th fibonacci series is "+arr[n-1]);

}
}
