package globallogic;

import java.util.ArrayList;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SplitString1 {
	public static void main(String[] args) {
		String str = "Location \"Welcome  to india\" Bangalore " + "Channai \"IT city\"  Mysore";
		Pattern p = Pattern.compile("[a-zA-Z]+|\".*?\"");
		Matcher match = p.matcher(str);
		ArrayList<String> s = new ArrayList<>();
		while (match.find()) {
			s.add(match.group(0));
		}
		Object[] obj = s.toArray();
		for (Object obj1 : obj) {
			System.out.println(obj1);
		}
	}
}
