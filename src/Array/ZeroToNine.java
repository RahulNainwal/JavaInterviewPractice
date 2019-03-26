package Array;

public class ZeroToNine {
	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int m = 0;
		for (int i = 1; i < arr.length; i++) {
			if (i % 2 == 0) {
				int n = i;
				while (n != m) {
					int temp = arr[n];
					arr[n] = arr[n - 1];
					arr[n - 1] = temp;
					n--;
				}
				m++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
