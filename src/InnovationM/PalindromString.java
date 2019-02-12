package InnovationM;

import java.util.Scanner;

public class PalindromString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :"); 
		String string = sc.nextLine();
		String string1 = "";
		for(int i=string.length()-1;i>=0;i--){
			// Difference Between Concat() and + (String Concatenation Operator) in 
			//string1 = string1+String.valueOf(string.charAt(i));
			string1 = string1.concat(String.valueOf(string.charAt(i)));
		}
		System.out.println(string1);
		if(string.equals(string1)){
			System.out.println("String is Palindrom");
		}
		else{
			System.out.println("String is not Palindrom");
		}
	}
}
