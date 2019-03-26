package globallogic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SplitString2 {
	public static void main(String[] args) {
		String s = "rahkdf38 hew fnodnfl 892njnfwdf9 ehwof 82r2hff 89rfnoksfh wfhwfn";
		Pattern p = Pattern.compile("[a-z]+");
		Matcher m = p.matcher(s);
		while (m.find()) {
			System.out.println(m.group(0));
		}
	}
}
