package String;

public class CountInString {
	public static void main(String[] args) {
		String s = "920KW NSNjdn dl oNlknld 23i23";
		int charCount = 0, intCount = 0, spaceCount = 0;
		System.out.println(s.length());
		for (int i = 0; i < s.length(); i++) {
			if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) {
				charCount++;
			} else if (s.charAt(i) == ' ') {
				spaceCount++;
			} else {
				intCount++;
			}
		}
		System.out.println("Character count " + charCount + " Number count " + intCount + " Space count" + spaceCount);
	}
}
