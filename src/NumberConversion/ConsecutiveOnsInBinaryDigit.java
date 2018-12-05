package NumberConversion;

import java.util.Scanner;

public class ConsecutiveOnsInBinaryDigit {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Binary digit");
	Long x = sc.nextLong();
	
	int count=0;
	System.out.println();
	 while (x!=0) 
     { 
         // This operation reduces length 
         // of every sequence of 1s by one. 
         x = (x & (x << 1)); 

         count++; 
     }
	System.out.println(count);
	
}
}
