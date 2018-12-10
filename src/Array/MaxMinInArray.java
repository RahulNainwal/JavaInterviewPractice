package Array;

import java.util.Scanner;

public class MaxMinInArray {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n;
	System.out.println("Enter the size of array");
	n = sc.nextInt();
	int[] arr = new int[n];
	System.out.println("Enter Array Elments");
	for(int i=0;i<arr.length;i++){
		arr[i] = sc.nextInt();
	}
	int min=arr[0];
	int max=arr[0];
	for(int i=0;i<arr.length;i++){
		if(arr[i]>max){
			max=arr[i];
		}
		if(arr[i]<min){
			min = arr[i];
		}
	}
	System.out.println(min+" "+max);
	}

}
