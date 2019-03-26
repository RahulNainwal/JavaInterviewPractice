package HackerEarth;

import java.util.Scanner;

public class Professorandhisoperations {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		Scanner sc = new Scanner(System.in);
		int arr1[] = new int[2];
		for (int i = 0; i < 2; i++) {
			System.out.println("Enter operation ");
			for (int j = 0; j < arr1.length; j++) {
				arr1[j] = sc.nextInt();
			}

			for (int k = arr1[0] - 1; k <= arr1[1] - 1; k++) {
				int legth = arr.length - 1;
				int even = 0, odd = 0;
				if (arr[legth] % 2 == 0) {
					even = legth;
					odd = legth - 1;
				} else {
					even = legth - 1;
					odd = legth;
				}
				if (arr[k] % 2 == 0) {
					int temp = arr[k];
					arr[k] = arr[even];
					arr[even] = temp;
				} else {
					int temp = arr[k];
					arr[k] = arr[odd];
					arr[odd] = temp;
				}
			}

			for (int in : arr) {
				System.out.print(in + " ");
			}
		}

	}

	public static void swap(int[] arr, int x, int y) {
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}

}
