package InnovationM;

import java.util.Scanner;

public class PalindromNumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number:");
	int x = sc.nextInt();
	int iniValue=x,reverse =0;
	while(x >0){
		reverse = reverse * 10;
		reverse = reverse + (x % 10);
		x = x /10;
	}
	System.out.println("Reverse of Number "+reverse);
	if(iniValue == reverse){
		System.out.println("Number is Palindrom");
	}
	else{
			System.out.println("Number is not Palimdrom");
	}

}
}
