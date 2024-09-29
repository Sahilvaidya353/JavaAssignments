package Array;

//max and min array and average elements in array
public class ArrayMax {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6 };
		int max = 0;
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		int sum = 0;
		for (int i : a) {
			sum += i;
		}
		double avg = sum / a.length;
		System.out.println("Maximum value in array =" +max);
		System.out.println("Average of array elements ="+avg);
	}

}
