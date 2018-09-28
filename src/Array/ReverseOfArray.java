package Array;

public class ReverseOfArray {
 public static void main(String args[]){
	 int[] arr = {13,4,53,67,546,464,3567,88,12};
	 System.out.println("Original Array is");
	 for(int i=0;i<arr.length;i++){
		 System.out.print(arr[i]+" ");
	 }
	 System.out.println("Reverse Array is");
	 for(int i=arr.length-1;i>=0;i--){
		 System.out.print(arr[i]+" ");
	 }
 }
}
