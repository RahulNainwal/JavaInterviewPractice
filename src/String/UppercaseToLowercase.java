package String;

public class UppercaseToLowercase {
	public static void main(String[] args) {
		String s = "Rahul NaINWal";

		String s1 = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
				s1 = s1.concat(String.valueOf((char) (s.charAt(i) + 32)));
			} else {
				s1 = s1.concat(String.valueOf((char) (s.charAt(i) - 32)));
			}
		}
		System.out.println(s1);
		// System.out.println((char)('A'+32));
	}
}
