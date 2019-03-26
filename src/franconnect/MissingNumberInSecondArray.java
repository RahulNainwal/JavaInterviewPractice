package franconnect;

public class MissingNumberInSecondArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 ,6,7,8};
		int[] arr1 = { 0, 1, 2, 3, 5 };
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr1.length; j++) {
				if (arr[i] == arr1[j]) {
					count++;
					break;
				}
			}
			if (count == 0)
				System.out.println("Missing Number is " + arr[i]);
		}
	}
}
