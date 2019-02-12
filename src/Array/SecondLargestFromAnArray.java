package Array;

import java.util.Scanner;

public class SecondLargestFromAnArray {
	public static void main(String[] args) {
		int[] arrr = new int[6];
		Scanner sc = new Scanner(System.in);
		System.out.println("Provide inputs:");
		for(int i=0;i<arrr.length;i++){
			arrr[i] = sc.nextInt();
		}
		int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE,secMin=Integer.MIN_VALUE;
		for(int i=0;i<arrr.length;i++){
			if(arrr[i] >max){
				secMin = max;
				max = arrr[i];
			}
			if(arrr[i]<min){
				min = arrr[i];
			}
			if(arrr[i]<max && arrr[i]>secMin){
				secMin=arrr[i];
			}
			/*
			if(arrr[i] >max){
				max = arrr[i];
			}
			if(arrr[i]<min){
				min = arrr[i];
			}
			for(int j=0;j<arrr.length;j++){
				if(max>arrr[j] && secMin<arrr[j]){
					secMin = arrr[j];
				}
			}*/
			 /*if (arrr[i] > max) 
		        { 
				 secMin = max; 
		            max = arrr[i]; 
		        } 
		  
		         If arr[i] is in between first and  
		           second then update second  
		        else if (arrr[i] > secMin && arrr[i] != max) 
		        	secMin = arrr[i];*/
		}
		System.out.println("Max"+max+" "+"Second Max"+secMin+" "+"Min"+min);
	}
}
