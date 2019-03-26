package globallogic;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SplitString {
	public static void main(String[] args) {
		String str = "Location \"Welcome  to india\" Bangalore " + "Channai \"IT city\"  Mysore";

		List<String> list = new ArrayList<String>();
		Object[] objects;
		Matcher m = Pattern.compile("([^\"]\\S*|\".+?\")\\s*").matcher(str);
		while (m.find())
			list.add(m.group(1)); // Add .replace("\"", "") to remove
									// surrounding quotes.

		// System.out.println(list);
		objects = list.toArray();
		for(Object obj:objects){
			System.out.println(obj);
		}
	}
}
