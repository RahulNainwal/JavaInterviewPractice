package HackerEarth;

import java.util.LinkedHashMap;

public class StringStr {
	public static void main(String[] args) {
		String s = "rangeethiour";
		int counta = 0, counte = 0, counti = 0, counto = 0, countu = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a')
				counta++;
			if (s.charAt(i) == 'e')
				counte++;
			if (s.charAt(i) == 'i')
				counti++;
			if (s.charAt(i) == 'o')
				counto++;
			if (s.charAt(i) == 'u')
				countu++;
		}
		if (counta > 0 && counte > 0 && counti > 0 && counto > 0 && countu > 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
