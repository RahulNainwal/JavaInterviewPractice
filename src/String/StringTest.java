package String;

import java.util.Scanner;

public class StringTest {
public static void main(String[] args) {
	int count = 0,count2 = 0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter String");
	String s = sc.nextLine();
	for(int i=0;i<s.length();i++){
		if(s.charAt(i) == ' '){
			count2++;
		}
	}
	for(int i=0;i<s.length();i++){
		if(i==0)
			System.out.print(s.toUpperCase().charAt(0));
		else {
			if(s.charAt(i) == ' '){
				count++;
				if(count != count2){
					System.out.print(".");
					System.out.print(s.toUpperCase().charAt(i+1));
				}else{
					System.out.print(".");
					for(int j = i+1;j<s.length();j++)
						System.out.print(s.toUpperCase().charAt(j));
				}
			}
			}
	}
}
}
