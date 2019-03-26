package MohitQuestion;

// Split string from where repeat being started
public class SplitString {
	public static void main(String[] args) {
		String s = "raahul";
		String[] s1 = null;
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				s1 = s.split(s.charAt(i) + "");
			}
		}
		for (int i = 0; i < s1.length; i++) {
			System.out.println(s1[i]);
		}
	}
}
