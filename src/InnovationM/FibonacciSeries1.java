package InnovationM;

import java.util.Scanner;

// series till input number
public class FibonacciSeries1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number till you want series");
		int x = sc.nextInt();
		int i = 0, j = 1;
		{
			int temp = i+j;
			while (temp <x) {
					temp = i + j;
						i = j;
						j = temp;
						System.out.println(i);
			}
		}
	}
}
