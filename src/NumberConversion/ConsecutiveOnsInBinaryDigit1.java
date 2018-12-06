package NumberConversion;

import java.util.Scanner;

public class ConsecutiveOnsInBinaryDigit1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Binary digit");
		Long x = sc.nextLong();
		String x1 = String.valueOf(x);
		String[] arr = x1.split("0");
		int big = arr[0].length();
		for(int i=0;i<arr.length;i++){
			if(arr[i].length()>big){
				big = arr[i].length();
			}
		}
		System.out.println(big);

	}

}
