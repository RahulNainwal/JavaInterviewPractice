package Sorting;

public class Merge_Sort1 {
	public static void main(String[] args) {
		int arr[] = { 43, 232, 344, 232, 65, 8, 87, 34, 2, 21 };
		System.out.println("Given Array");
		printArray(arr);
		Merge_Sort1 ms = new Merge_Sort1();
		ms.sort(arr, 0, arr.length - 1);
		System.out.println();
		printArray(arr);
	}

	private void sort(int[] arr, int i, int j) {
		if (i != j) {
			int mid = (i + j) / 2;
			sort(arr, i, mid);
			sort(arr, mid + 1, j);
			merge(arr, i, mid, j);
		}
	}

	private void merge(int[] arr, int l, int m, int r) {
		int temp[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}
		int i=l,j=m+1,k=l;
		while(i<=m && j<=r){
			if(temp[i]<=temp[j]){
				arr[k++] = temp[i++];
			}else{
				arr[k++] = temp[j++];
			}
		}
		/* Copy remaining elements of L if any */
		while(i<=m){
			arr[k++] = temp[i++];
		}
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
