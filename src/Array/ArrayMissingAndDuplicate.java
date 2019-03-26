package Array;

public class ArrayMissingAndDuplicate {
	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 4, 5, 5, 6, 7, 8 };
		int[] arr1 = new int[arr.length];
		for (int i : arr) {
			arr1[i] = arr1[i] + 1;
		}

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == 0) {
				System.out.println("Missing Number is " + i);
			}
			if(arr1[i] ==2){
				System.out.println("Duplicate Number is "+i);
			}
		}
	}
}
