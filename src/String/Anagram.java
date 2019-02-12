package String;

import java.util.Scanner;

public class Anagram {
	public static String sort(String s) {
		char[] ch1 = s.toCharArray();
		for (int i = 0; i < ch1.length - 1; i++) {
			for (int j = i + 1; j < ch1.length; j++) {
				if (ch1[j] < ch1[i]) {
					char ch = ch1[i];
					ch1[i] = ch1[j];
					ch1[j] = ch;
				}
			}
		}
		return new String(ch1);
	}

	public static String compare(String s, String s1) {
		if (s.length() != s1.length()) {
			return "Not Anagram";
		} else {
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == s1.charAt(i)) {
					return "Anagram String";
				} else {
					return "Not Anagram";
				}
			}
		}
		return "";
	}

	public static void main(String[] args) {
		String s = "geeksforgeeks";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string to check it");
		String s1 = sc.nextLine();
		s = Anagram.sort(s);
		s1 = Anagram.sort(s1);
		System.out.println(compare(s, s1));
	}
}
