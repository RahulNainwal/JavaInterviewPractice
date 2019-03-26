package Array;

public class RemoveDuplicate {
	public static void main(String[] args) {
		int arr[] = { 2, 32, 2, 4, 5, 5, 7, 8, 9, 9 };
		int[] temp = new int[arr.length];
		int m = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
			int count = 1;
			for (int j = 0; j < m; j++) {
				if (arr[i] == temp[j]) {
					count++;
				}
			}
			if (count == 1) {
				temp[m++] = arr[i];
			}
		}
		for (int i = 0; i < m; i++) {
			System.out.print(temp[i] + " ");
		}
	}
}
