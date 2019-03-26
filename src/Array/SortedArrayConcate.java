package Array;

public class SortedArrayConcate {
	public static void main(String[] args) {

		int arr[] = { 3, 4, 5, 6, 6, 7, 8, 9, 9};
		int arr1[] = { 1, 2, 3, 5, 6, 7 };

		/*
		 * int arr[] = { 1, 2, 3, 4, 5 }; int arr1[] = { 3, 5, 6, 7 };
		 */
		int max = 0, min = 0;
		if (arr.length > arr1.length) {
			max = arr.length;
			min = arr1.length;
		} else {
			max = arr1.length;
			min = arr.length;
		}
		int newArr[] = new int[min + max];
		int m = 0, n = 0, index = 0;
		for (int i = 0; i < newArr.length - 1; i++) {
			if (n < min || m < min) {
				if (arr[m] < arr1[n]) {
					newArr[index++] = arr[m++];
				} else if (arr[m] > arr1[n]) {
					newArr[index++] = arr1[n++];
				} else if (arr[m] == arr1[n]) {
					newArr[index++] = arr[m++];
					newArr[index++] = arr1[n++];
				}
			} else {
				if (m == min && n < arr1.length) {
					newArr[index++] = arr1[n++];
				} else if (m < arr.length) {
					newArr[index++] = arr[m++];
				}
			}
		}
		for (int i : newArr) {
			System.out.print(i + " ");
		}
	}
}
