package franconnect;

import java.util.ArrayList;

public class MaxPalindromFromString {
	public static void main(String[] args) {
		String s = "DDABCBAAA";
		int max = 0;
		String maxPalindrom = "";
		ArrayList<String> list = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length() - 1; j++) {
				if (s.charAt(i) == s.charAt(j)) {
					list.add(s.substring(i, j + 1));
				}
			}
		}
		for (int i = 1; i < list.size(); i++) {
			String temp = "";
			for (int j = list.get(i).length() - 1; j >= 0; j--) {
				temp = temp.concat(String.valueOf(list.get(i).charAt(j)));
			}
			if (temp.equals(list.get(i)) && temp.length() > maxPalindrom.length()) {
				maxPalindrom = list.get(i);
			}
		}
		System.out.println("Max Palindrom is : " + maxPalindrom);
	}
}
