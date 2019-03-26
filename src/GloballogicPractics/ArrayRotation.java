package GloballogicPractics;

public class ArrayRotation {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int dd = 2
				;
		System.out.println("Before Rotation ");
		show(arr);
		for (int i = 0; i <= dd; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				int tem = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = tem;
			}
		}
		System.out.println();
		System.out.println("After Rotation ");
		show(arr);
	}

	public static void show(int[] arr) {
		for (int i : arr)
			System.out.print(i + " ");
	}
}
