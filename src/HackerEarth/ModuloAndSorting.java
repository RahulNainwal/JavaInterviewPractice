package HackerEarth;

import java.util.Scanner;

public class ModuloAndSorting {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Ente the Size of array :");
	int x = sc.nextInt();
	System.out.println("Enter number to take modulo :");
	int y= sc.nextInt();
	int[] arr = new int[x];
	System.out.print("Enter Array elements :");
	for(int i=0;i<x;i++){
		arr[i] = sc.nextInt();
	}
	for(int i=0;i<arr.length;i++){
		for(int j= i+1;j<arr.length;j++){
			if(arr[i]%y>arr[j]%y){
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				
			}
		}
	}
	for(int i=0;i<arr.length;i++){
		System.out.print(arr[i]+" ");
	}
}
}
