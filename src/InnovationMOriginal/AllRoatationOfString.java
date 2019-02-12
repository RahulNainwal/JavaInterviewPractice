package InnovationMOriginal;

import java.util.TreeSet;

public class AllRoatationOfString {
	public static void main(String[] args) {
		String s = "GOD";
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < s.length(); i++)
			sb.append(s);
		int x = s.length();
		for (int i = 0; i < x; i++) {
			for (int j = 0; j != x; j++)
				System.out.print(sb.charAt(i + j));
			System.out.println();
		}
	}
}
