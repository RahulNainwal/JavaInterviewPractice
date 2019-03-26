package SearchingAlgorithm;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		boolean what = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array :");
		int x = sc.nextInt();
		int[] arr = new int[x];
		System.out.println("Enter array elements ");
		for (int i = 0; i < x; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter element to search");
		int y = sc.nextInt();
		for (int i = 0; i < x; i++) {
			if (arr[i] == y) {
				System.out.println(i);
				what =  true;
				break;
			}
		}
		if(what == false){
			System.out.println("No Matched Number");
		}
	}
}
