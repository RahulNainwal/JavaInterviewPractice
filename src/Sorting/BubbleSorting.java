package Sorting;

import java.util.Scanner;

public class BubbleSorting {
	public static void main(String args[]){
		int[] arr;
		System.out.println("Enter number of element is array :");
		Scanner scanner = new Scanner(System.in);
		int c = scanner.nextInt();
		arr = new int[c];
		System.out.println("Entet "+c+" Numbers");
		for(int i =0;i<c;i++){
			arr[i] = scanner.nextInt();
		}
		System.out.println("Array Elements");
		for(int i=0;i<arr.length;i++){
			//System.out.println(arr[i]);
		}
		
		
		// first loop for pass
		for(int i=0;i<arr.length;i++){
			// loop for iteration in each phase for comparing each adjacent element till length-1
			for(int j=0;j<arr.length-i-1;j++){
				if(arr[j+1] < arr[j]){
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		// for displaying array elements
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}

}
