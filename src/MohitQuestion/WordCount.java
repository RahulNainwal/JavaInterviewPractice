package MohitQuestion;

import java.util.LinkedHashSet;

public class WordCount {
	public static void main(String[] args) {
		String s = "my name is mohit my name is kumar my";
		String[] str = s.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<>();
		for (int i = 0; i <= str.length - 1; i++) {
			int count = 1;
			if (set.contains(str[i])) {
				continue;
			} else {
				for (int j = i + 1; j < str.length; j++) {
					if (str[i].equals(str[j])) {
						count++;
						set.add(str[i]);
					}
				}
			}
			System.out.println("Word count for " + str[i] + " = " + count);
		}
	}
}
