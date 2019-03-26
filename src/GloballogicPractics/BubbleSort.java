package GloballogicPractics;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = { 11, 25, 22, 12, 64, 4, 23, 54, 4, 3, 2, 1 };
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i-1; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}
