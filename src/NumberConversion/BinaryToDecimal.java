package NumberConversion;

import java.util.Scanner;

public class BinaryToDecimal {
public static void main(String[] args) {
	int decimal=0,p=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Binary number :");
	int number = sc.nextInt();
	while(number != 0 ){
		decimal += ((number % 10)*Math.pow(2, p));
		number = number/10;
		p++;
	}
	
	System.out.println("Decimal Number is :"+decimal);
}
}
