package Sorting;

import java.util.Scanner;

public class Merge_Sort {
    
	public static void main(String args[]) 
    { 
        int arr[] = {43,232,344,232,65,8,87,34,2,21};
        System.out.println("Given Array"); 
        printArray(arr); 
  
        MergeSort ob = new MergeSort(); 
        ob.sort(arr, 0, arr.length-1); 
  
        System.out.println("\nSorted array"); 
        printArray(arr); 
    }
	public static void printArray(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}
class MergeSort{
	public void sort(int[] arr,int start,int last){
		if(last>start){
			int mid = (start + last)/2;
			sort(arr,start,mid);
			sort(arr,mid+1,last);
			merge(arr,start,mid,last);
		}
	}

	private void merge(int[] arr, int l, int m, int r) {
		int[] temp =new int[arr.length];
		for(int i= 0;i<arr.length;i++){
			temp[i] = arr[i];
		}
		int i=l,j=m+1,k=l;
		while(i<=m && j<=r){
			if(temp[i]<=temp[j]){
				arr[k] = temp[i];
				i++;
			}else{
				arr[k] = temp[j];
				j++;
			}
			k++;
		}
		/* Copy remaining elements of L if any */
		while(i<=m){
			arr[k] = temp[i];
			k++;
			i++;
		}
		
	}
}
