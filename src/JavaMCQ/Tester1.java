package JavaMCQ;

import java.awt.List;
import java.util.ArrayList;

class Gum implements chewable{}
class Meat implements chewable{}
public class Tester1 {
	public static void main(String[] args) {
		List list = new ArrayList<>(chewable);
		list.add(new Gum());
		list.add(new Meat());
		list.add(new Integer(10));
	}

}
