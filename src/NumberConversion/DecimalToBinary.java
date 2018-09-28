package NumberConversion;

import java.util.Scanner;

public class DecimalToBinary {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Decimal Number :");
	int number = sc.nextInt();
	int rem;
	String str="";
	while(number != 0){
		rem = number % 2;
		number = number / 2;
		str = str + rem;
	}
	System.out.println("Number in Binary :");
	for(int i=str.length()-1;i>=0;i--){
		System.out.print(str.charAt(i));
	}
}
}
