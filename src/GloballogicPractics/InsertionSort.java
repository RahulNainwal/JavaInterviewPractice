package GloballogicPractics;

public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = { 11, 25, 22, 12, 64, 4, 23, 54, 4, 3, 2, 1 };
		System.out.println("Before Sorting :");
		InsertionSort.showData(arr);
		System.out.println();
		InsertionSort.sort(arr);
		System.out.println("After Sorting :");
		InsertionSort.showData(arr);
	}

	public static void showData(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void sort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int x = i + 1;
			while (x != 0 && arr[x] < arr[x - 1]) {
				int temp = arr[x];
				arr[x] = arr[x - 1];
				arr[x - 1] = temp;
				x--;
			}
		}
	}
}
