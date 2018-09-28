package Array;

public class SumOfTwoArray {
public static void main(String[] args) {
	int arr[] = {1,4,5,2,4};
	int arr2[] = {4,6,2,8,9};
	int arr3[] = new int[arr2.length];
	for(int i=0;i<arr.length;i++){
		arr3[i] = arr[i] + arr2[i];
	}
	for(int i=0;i<arr.length;i++){
		System.out.print(arr3[i]+" ");
	}
}
}
