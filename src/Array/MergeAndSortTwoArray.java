package Array;

import java.sql.Array;
import java.util.Scanner;

public class MergeAndSortTwoArray {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int[] arr1,arr2;
	System.out.println("Enter Size of first array:");
	int x = sc.nextInt();
	arr1 = new int[x];
	System.out.println("Enter size of Second array:");
	int y = sc.nextInt();
	arr2 = new int[y];
	System.out.println("Enter array1 elements");
	for(int i =0;i<x;i++){
		arr1[i] = sc.nextInt();
	}
	System.out.println("Enter array2 elements");
	for(int i =0;i<y;i++){
		arr2[i] = sc.nextInt();
	}
	sort(arr1);
	sort(arr2);
	//show(arr1);
	//show(arr2);
	System.out.println("New Sorted Array is :");
	show(mergeToArray(arr1,arr2));
}
private static int[] mergeToArray(int[] arr1, int[] arr2) {
	
	int[] newArray = new int[(arr1.length)+(arr2.length)];
	int i=0,j=0,k=0;
	while(i<arr1.length && j<arr2.length){
	if(arr2[j]<arr1[i]){
		newArray[k] = arr2[j];
		j++;
	}
	else{
		newArray[k] = arr1[i];
		i++;
	}
	k++;
	}
	while(i<arr1.length){
		newArray[k] = arr1[i];
		k++;
		i++;
	}
	while(j<arr2.length){
		newArray[k] = arr2[j];
		k++;
		j++;
	}
	return newArray;
}
public static void sort(int[] arr){
	// selection sorting 
	for(int i=0;i<arr.length;i++){
		for(int j=i+1;j<arr.length;j++){
			if(arr[i]>arr[j]){
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
	}
	
}
public static void  show(int[] arr){
	for(int i=0;i<arr.length;i++){
		System.out.print(arr[i]+" ");
	}
}
}