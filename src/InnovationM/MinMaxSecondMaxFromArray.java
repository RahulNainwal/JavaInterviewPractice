package InnovationM;

import java.util.Scanner;

public class MinMaxSecondMaxFromArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sizr of Array");
		int x = sc.nextInt();
		int[] arr = new int[x];
		System.out.println("Enter Elements ");
		for (int i = 0; i < x; i++) {
			arr[i] = sc.nextInt();
		}
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, secondMax = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
			if (arr[i] > max) {
				secondMax = max;
				max = arr[i];
			}
		}
		System.out.println("Max value is " + max + " SecondMax value is " + secondMax + " Minimum value is " + min);
	}
}
