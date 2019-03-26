package HackerEarth;

import java.util.regex.Pattern;

// To check weather a given regular expression is valid or note
public class RegexChecker {
	public static void main(String[] args) {
		String[] s = { "([A-Z])(.+)", "[AZ[a-z](a-z)", "batcatpat(nat" };
		for (int i = 0; i < s.length; i++) {
			try {
				Pattern pattern = Pattern.compile(s[i]);
				System.out.println("Valid");
			} catch (Exception e) {
				System.out.println("Invalid");
				//System.exit(1);
			}
		}
	}
}
