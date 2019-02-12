package Array;

import java.util.Scanner;

class Student{
	int id ;
	String name;
}
public class ArrayWithObject {
public static void main(String[] args) {
	Object[] arr = new Object[6];
	Scanner sc = new Scanner(System.in);
	arr[0] ="rahul";
	arr[1] = 1;
	arr[2] = 3;
	arr[4] = 'r';
	for(int i=0;i<arr.length;i++){
		System.out.println(arr[i]);
	}
} 
}
