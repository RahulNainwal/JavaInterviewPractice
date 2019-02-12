package NumberConversion;

import java.util.Scanner;

public class ReverseOfNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number :");
		int x = sc.nextInt();
		int iniValue = x;
		int reverse = 0;
		while (x > 0) {
			reverse = reverse * 10;
			reverse = reverse + x % 10;
			x = x / 10;
		}
		System.out.println("Reverse of Number "+reverse);
	}

}
