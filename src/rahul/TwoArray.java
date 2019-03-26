package rahul;

import java.util.Scanner;

public class TwoArray {
// we have a problem in which we have two distinct and sorted array we have to find common element in both
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first array size");
		int n= sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enter first array elements");
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("enter Second array size");
		int m= sc.nextInt();
		int arr1[] = new int[m];
		System.out.println("enter first array elements");
		for(int i=0;i<m;i++){
			arr1[i] = sc.nextInt();
		}
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr1.length;j++){
				if(arr[i]<arr1[j]){
					break;
				}
				else{
					if(arr[i]==arr1[j]){
						System.out.println(arr[i]);
					}
				}
			}
		}
	}
}
