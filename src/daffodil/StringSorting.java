package daffodil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringSorting {
	public static void main(String[] args) {
		String name = "nmdiudf739kJDklklfiNF8320920LKNkjs";
		Pattern p = Pattern.compile("[a-z]");
		Pattern p1 = Pattern.compile("[A-Z]");
		Pattern p2 = Pattern.compile("[0-9]");
		Matcher m = p.matcher(name);
		Matcher m1 = p1.matcher(name);
		Matcher m2 = p2.matcher(name);
		
	}

	public static Object[] getData(Matcher m) {
		ArrayList<String> list = new ArrayList<>();
		while (m.find()) {
			list.add(m.group(0));
		}
		Collections.sort(list);
		return list.toArray();
	}

	public static void showData(Object[] arr) {
		for (Object ar : arr) {
			System.out.println(ar);
		}
	}

}
