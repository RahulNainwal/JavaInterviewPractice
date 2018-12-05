package Array;

import java.util.Scanner;

public class copy_one_array_to_another {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,m;
		System.out.println("Enter the size of array:");
		n = sc.nextInt();
		int[] arr = new int[n];
		int[] arr2 = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++){
			arr2[i] = sc.nextInt();
		}
		System.out.println("Before copy array1 :");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Before copy array2 :");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		for(int i= 0;i<arr.length;i++){
			arr[i] = arr2[i];
		}
		System.out.println("After copy array1 :");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}

}
