package Sorting;

public class SelectionSort1 {
	public static void main(String[] args) {
		int[] arr = { 324, 43, 5, 55, 453, 232, 43 };
		System.out.println("Before Sorting ");
		for(int i:arr){
			System.out.print(+i+" ");
		}
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<arr[i]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("After Sorting ");
		for(int i:arr){
			System.out.print(+i+" ");
		}
	}
}
