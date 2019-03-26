package Array;

import java.util.Arrays;

public class FilterArray {
	public static void main(String[] args) {
		int[] arr = { 1, 0, 1, 2, 0, 1, 2, 0 };
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] == 1) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				} else if (arr[j] > 1) {
					break;
				}
			}
		}
		for (int i : arr)
			System.out.print(i + " ");
	}
}
