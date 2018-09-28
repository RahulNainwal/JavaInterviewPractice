package String;

import java.util.Scanner;

public class Reverse1 {
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter String");
	String str = sc.nextLine();
	
	String[] str1 = str.split(" ");
	for(int i=0;i<str1.length;i++){
		System.out.println(str1[i]);
	}
	for(int i = str.length();i>0;i--){
			System.out.print(str.charAt(i-1));
	}
	}
}
