package rahul;

import java.util.HashMap;
import java.util.Map;

public class AnagramsInJava {
	public static void main(String[] args) {

		String A = "Rahulnainwal";
		String B = "nainwalRahul";
		/*
		 * String A = "anagram"; String B = "margana";
		 */
		/*
		 * Map<Character,Integer> map = new HashMap<>(); Map<Character,Integer>
		 * map1 = new HashMap<>(); int res = 0; for (int i = 0; i < A.length();
		 * i++) { res ^= A.charAt(i); res ^= B.charAt(i); }
		 * System.out.println('a'^ 'a' ); for(int i=0;i<A.length();i++){ int
		 * count=0; for(int j=0;j<A.length();j++){ if(A.charAt(i)==A.charAt(j)){
		 * count++; } } map.put(A.charAt(i), count); } for(int
		 * i=0;i<B.length();i++){ int count=0; for(int j=0;j<B.length();j++){
		 * if(B.charAt(i)==B.charAt(j)){ count++; } } map1.put(B.charAt(i),
		 * count); } if(map.equals(map1)){ System.out.println("Aagrams"); }
		 * else{ System.out.println("Not Aagrams"); }
		 */
		if (A.length() != B.length()) {
			System.out.println("NO");
		} else {
			int x = 0;
			for (int i = 0; i < A.length(); i++) {
				x = x + A.charAt(i);
				x = x - B.charAt(i);
			}
			if (x == 0)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
