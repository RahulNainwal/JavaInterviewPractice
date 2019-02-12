package InnovationM;

public class StringRepeat {
	public static void main(String[] args) {
		String s = "rahulnainwal";
		for (int i = 0; i < s.length(); i++) {
			int count = 0;
			for (int k = 0; k < s.length(); k++) {
				if (s.charAt(i) == s.charAt(k)) {
					count++;
				}
			}
			String s1 = s.substring(0, i + 1);
			String s2 = s.substring(i + 1);
			if(s2.contains(String.valueOf(s.charAt(i))))
			s2 = s2.replace(String.valueOf(s.charAt(i)), "");
			s = s1.concat(s2);
			System.out.println(s.charAt(i) + " Repeated At " + count + " time");
		}
	}
}
