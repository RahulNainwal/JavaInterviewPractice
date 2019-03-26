package String;

import java.util.List;

import collection.ArrayList;

public class SplitWithoutMethod {
	public static void main(String[] args) {
		String s = "mohit@microsoft.com";
		List<String> list = new java.util.ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '@') {
				list.add(s.substring(0, i));
				list.add(s.substring(i + 1));
			}
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
