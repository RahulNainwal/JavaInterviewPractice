package Array;

import java.util.HashSet;
import java.util.Scanner;

// program to find pair in array
public class FindPairInArray {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Size of array");
	int n = sc.nextInt();
	int totalPair = 0;
	int[] arrr = new int[n];
	for(int i=0;i<arrr.length;i++){
		arrr[i] = sc.nextInt();
	}
	// Hash set contains unique values and did not maintain insertion order
	HashSet<Integer> set = new HashSet<>();
	for(int i=0;i<=arrr.length-1;i++){
		int count=1;
		if(!set.contains(arrr[i])){
			for(int j=i+1;j<arrr.length;j++){
				if(arrr[i]==arrr[j]){
					count = count + 1;
					set.add(arrr[i]);
				}
			}
			totalPair = totalPair + (count/2); 
		}
	}
	System.out.println(set);
	System.out.println(totalPair);
}
}
