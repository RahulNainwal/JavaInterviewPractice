package String;

import java.util.HashSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String s = "rahul nainwal";
		for (int i = 0; i < s.length() - 1; i++) {
			int count = 1;
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					count++;
				}
			}
			if (count > 1) {
				String s1 = s.substring(i + 1);
				String s2 = s.substring(0, i + 1);
				s1 = s1.replace(String.valueOf(s.charAt(i)), "");
				s = s2.concat(s1);
			}
		}
		System.out.println(s);
	}
}
