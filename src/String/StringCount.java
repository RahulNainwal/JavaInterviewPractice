package String;

import java.util.Scanner;

public class StringCount {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		System.out.println("Enter char to check");
		char c = sc.next().charAt(0);
		int count = 0;
		// to check repeation of enter char 
		for(int i=0;i<str.length();i++){
			if(c == str.charAt(i)){
				count++;
			}
		}
		if(count >0){
			System.out.println(c +" is repeated at "+count+" time" );
		}
		
		// to check repeation of each char
		for(int i= 0;i<str.length();i++){
			int count1 = 0;
			for(int j=0;j<str.length();j++){
				if(str.charAt(i) == str.charAt(j)){
					count1++;
				}
			}
			if(count1 >0){
				System.out.println(str.charAt(i)+" is repeated at "+count1+" time");
				//str = str.replace(String.valueOf(str.charAt(i)),"");	
				//System.out.println(str);		
			}
		}
	}

}
