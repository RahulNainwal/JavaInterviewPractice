package Sorting;

public class InsertionSorting1 {
	public static void main(String[] args) {
		int arr[] = { 13, 4, 5454, 33, 12, 1, 34, 63 };
		System.out.println("Before Sorting :");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i = 0; i < arr.length - 1; i++) {
			int k=i;
			while (k >= 0 && arr[k] > arr[k + 1]) {
				int tem = arr[k];
				arr[k] = arr[k + 1];
				arr[k + 1] = tem;
				k--;
			}
		}
		System.out.println("After Sorting :");
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
