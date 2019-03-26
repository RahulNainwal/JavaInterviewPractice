package GloballogicPractics;

public class BinarySearch {
	public static void main(String[] args) {
		BinarySearch ob = new BinarySearch();
		int arr[] = { 2, 3, 4, 10, 40 };
		int n = arr.length;
		int x = 40;
		int result = ob.binarySearch(arr, 0, n - 1, x);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index " + result);
	}

	private int binarySearch(int[] arr, int i, int j, int x) {
		if (j >= i) {
			int mid = i + (j - i) / 2;
			if (arr[mid] == x)
				return mid;
			if (arr[mid] > x)
				return binarySearch(arr, i, mid - 1, x);
			if (arr[mid] < x)
				return binarySearch(arr, mid + 1, j, x);
		}
		return -1;
	}
}
