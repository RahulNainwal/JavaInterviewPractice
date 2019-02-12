package ongraph;
// find missing value from string.
public class Ongraph1 {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 4, 6, 3, 7, 8 };
		int sum =0;
		int total = arr.length * (arr.length + 1)/ 2;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("Missing Term is "+(sum-total));
	}
}
