package InnovationM;

import java.util.Scanner;

public class AnagramString {
	public static void main(String[] args) {
		String s = "listen";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to check wather it is Anagram or not");
		String s1 = sc.nextLine();
		
		boolean value = false;
		if (s1.length() != s.length()) {
			System.out.println("String is not Anagram");
		} else {
			for (int i = 0; i < s.length(); i++) {
				int count = 0, count1 = 0;
				for (int j = i; j < s.length(); j++) {
					if (s.charAt(i) == s.charAt(j)) {
						count++;
					}
				}
				for (int j = 0; j < s1.length(); j++) {
					if (s.charAt(i) == s1.charAt(j)) {
						count1++;
					}
				}
				//
				//System.out.println(s.charAt(i) + " " + count + " " + count1);
				if (count != count1) {
					value = false;
					break;
				} else {
					value = true;
				}
			}
			if (value == true)
				System.out.println("Anagram String");
			else
				System.out.println("Not Anagram String");
		}
	}
}
