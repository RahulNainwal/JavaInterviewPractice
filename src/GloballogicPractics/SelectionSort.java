package GloballogicPractics;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = { 11, 25, 22, 12, 64, 4, 23, 54 };
		System.out.println("Before Sorting :");
		SelectionSort.showData(arr);
		System.out.println();
		SelectionSort.sort(arr);
		System.out.println("After Sorting :");
		SelectionSort.showData(arr);
	}

	public static void showData(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void sort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++)
				if (arr[min] > arr[j])
					min = j;

			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;

		}
	}
}
