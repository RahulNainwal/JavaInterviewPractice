package Array;

public class ArrayConcationation {
	static int m = 0, k = 0, l = 0, i = 0;

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 4, 5, 6 };
		int[] arr1 = new int[] { 1, 2, 3, 4, 4, 5, 6 };
		// System.out.println(arr2.length);
		int[] arr2 = ArrayConcationation.concate(arr, arr1);
		for (int i : arr2) {
			System.out.println(i);
		}
	}

	public static int[] concate(int[] arr1, int[] arr2) {
		int i = 0, j = 0, k = 0;
		int n1 = arr1.length;
		int n2 = arr2.length;
		int[] arr3 = new int[n1 + n2];
		// Traverse both array
		while (i < n1 && j < n2) {
			// Check if current element of first
			// array is smaller than current element
			// of second array. If yes, store first
			// array element and increment first array
			// index. Otherwise do same with second array
			if (arr1[i] < arr2[j])
				arr3[k++] = arr1[i++];
			else
				arr3[k++] = arr2[j++];
		}

		// Store remaining elements of first array
		while (i < n1)
			arr3[k++] = arr1[i++];

		// Store remaining elements of second array
		while (j < n2)
			arr3[k++] = arr2[j++];
		return arr3;
	}
}
