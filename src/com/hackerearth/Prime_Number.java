package com.hackerearth;

import java.util.Scanner;

public class Prime_Number {
public static void main(String[] args){
	int temp = 0;
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter number:");
	int n = scan.nextInt();
	if(n==1 | n==0){
		System.out.println("number is not prime");
	}
	if(n==2){
		System.out.println("number is prime");
	}
	else{
		for(int i=2;i<n;i++){
			temp = n%i;
			if(temp == 0)
				break;
			
		}
		if(temp == 0){
			System.out.println("Not prime number");
		}
		else{
			System.out.println("prime number");
		}
	}
}
}
