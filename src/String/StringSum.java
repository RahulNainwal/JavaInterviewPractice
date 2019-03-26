package String;

public class StringSum {
	public static void main(String[] args) {
		String s = "aad";
		int sum=0;
		for (int i = 0; i < s.length(); i++) {
			sum += (int)s.charAt(i);
		}
		System.out.println(sum);
	}
}
