package InnovationM;

import javax.swing.text.html.HTMLDocument.Iterator;

public class StringLengthWithoutFunction {
	public static void main(String[] args) {
		String s = "rahulnainwal";
		int count = 0;
		for(char c:s.toCharArray()){
			count++;
		}
		System.out.println(count+" "+s.length());
	}
}
