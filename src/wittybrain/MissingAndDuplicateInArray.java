package wittybrain;

// find missing and duplicate at the same time.
public class MissingAndDuplicateInArray {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 2, 3, 4, 6, 8, 8, 8 };
		int[] arr1 = new int[arr.length];
		for (int i : arr) {
			arr1[i] = arr1[i] + 1;
		}
		/*
		 * for (int i = 0; i < arr1.length; i++) { arr1[arr[i]] = 1; }
		 */

		for (int i = 1; i < arr1.length; i++) {
			if (arr1[i] == 0) {
				System.out.println("Missing is " + i);
			} else if (arr1[i] > 1) {
				System.out.println("Duplicate is " + i);
			}
		}
	}
}
