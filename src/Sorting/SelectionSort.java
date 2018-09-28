package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
	public static void main(String args[]){
		int[] arr;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int x = sc.nextInt();
		System.out.println("Enter "+x+" numbers");
		arr = new int[x];
		// for taking input using scanner
		for(int y = 0;y<x;y++){
			arr[y] = sc.nextInt();
		}
		// to find max from array
		System.out.println("Max Number is");
		System.out.println(getMaxValue(arr));
		// to find min from array
		System.out.println("Min Number is");
		System.out.println(getMinValue(arr));
		// to find output in sorted order
		int temp;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				
				if (arr[j] < arr[i])
                {
					// perform swaping here
                    temp =  arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
			}
			System.out.println(arr[i]);
		}
	}
	
	public static int getMaxValue(int[] numbers){
		  int maxValue = numbers[0];
		  for(int i=1;i < numbers.length;i++){
		    if(numbers[i] > maxValue){
			  maxValue = numbers[i];
			}
		  }
		  return maxValue;
		}
		public static int getMinValue(int[] numbers){
		  int minValue = numbers[0];
		  for(int i=1;i<numbers.length;i++){
		    if(numbers[i] < minValue){
			  minValue = numbers[i];
			}
		  }
		  return minValue;
		}
}
