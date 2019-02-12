package Sorting;

public class BubbleSorting1 {
public static void main(String[] args) {
	int[] arr = {12,32,4,54,46,455,6454,342,23};
	System.out.println("Before Bubble Sorting ");
	for(int i:arr){
		System.out.print(i+" ");
	}
	System.out.println();
	for(int i=0;i<arr.length;i++){
		for(int j=0;j<arr.length-i-1;j++){
			if(arr[j+1]<arr[j]){
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
	}
	System.out.println("After Bubble Sorting ");
	for(int i:arr){
		System.out.print(i+" ");
	}
}
}
