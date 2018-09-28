package Array;

import java.sql.Array;
import java.util.Scanner;

// java program to find that provide the desired sum;
public class TwoSumPrintaIndex {
public static void main(String[] args) {
	int[] arr;
	int x,y,sum,sum1 = 0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Size of array :");
	x = sc.nextInt();
	arr = new int[x];
	System.out.println("Enter "+x+" Array Elements");
	for(int i=0;i<x;i++){
		arr[i] = sc.nextInt();
	}
	System.out.println("Enter the sum =");
	sum = sc.nextInt();
	for(int i=0;i<arr.length;i++){
		for(int j=i+1;j<arr.length;j++){
			sum1 = arr[i] + arr[j];
			if(sum == sum1){
				System.out.println("First index "+i+" Second Index "+j);
				break;
			}
		}
		if(sum == sum1){
			break;
		}
	}
	if(sum != sum1)
	System.out.println("No index found");
}
}
