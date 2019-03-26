package GloballogicPractics;

public class QuickSort1 {
	public static void main(String[] args) {
		int arr[] = { 10, 7, 8, 9, 1, 5 };
		int n = arr.length;

		QuickSort1 ob = new QuickSort1();
		ob.sort(arr, 0, n - 1);

		System.out.println("sorted array");
		printArray(arr);
	}

	private void sort(int[] arr, int i, int j) {
		if (i <= j) {
			int x = partition(arr, i, j);
			sort(arr,i,x-1);
			sort(arr,x+1,j);
		}
	}

	private int partition(int[] arr, int i, int j) {
		int pivot = arr[j];
		int m = i - 1;
		for (int n = i; n < j ; n++) {
			if (arr[n] <= pivot) {
				m++;
				int temp = arr[m];
				arr[m] = arr[n];
				arr[n] = temp;
			}
		}
		int temp = arr[m + 1];
		arr[m + 1] = arr[j];
		arr[j] = temp;
		return m + 1;
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
