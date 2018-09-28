package Sorting;

class InsertionSort1{
	public void insertionSort(int[] arr,int n){
		for(int i=0;i<arr.length-1;i++){
			while(i>=0 && arr[i+1] < arr[i]){
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
				i--;
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
	}
}
}

public class InsertionSorting {
public static void main(String[] args) {
	int[] arr = {12,5,8,23,134,11, 13, 5, 6};
	int n = arr.length;
	InsertionSort1 is = new InsertionSort1();
	is.insertionSort(arr, n);
}
}
