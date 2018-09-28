package com.hackerearth;

import java.util.Scanner;

public class PrimeInArray {
	public static void main(String args[]){
		EnterArray er = new EnterArray();
		er.Array1();
	}

}
class EnterArray{
	int[] arr;
	public void Array1(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No Of Element");
		int x = sc.nextInt();
		arr = new int[x];
		System.out.println("Enter "+x+" Element");
		for(int i=0;i<x;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Prime Number in arrays are");
		for (int i = 0; i < arr.length; i++) {
            int count =0;
            if (arr[i] == 1)
                count++;
            else {
                // check to see if the numbers are prime
                for (int j = 2; j <= arr[i] / 2; j++) {
                    if (arr[i] % j == 0) {
                        count++;
                        break;
                    }
                }
            }
            // print the number
            if (count == 0)
                System.out.println(arr[i]);
	}
}
}
