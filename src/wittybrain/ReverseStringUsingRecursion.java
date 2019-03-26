
package wittybrain;

// reverse a string using recursion
public class ReverseStringUsingRecursion {
	public static void main(String[] args) {
		String s = "Rahul Nainwal";
		char[] ch = s.toCharArray();
		s = new String(ReverseStringUsingRecursion.recurcivCall(ch, 0, s.length() - 1));
		System.out.println(s);
	}

	public static char[] recurcivCall(char[] ch, int i, int j) {
		if (i != j) {
			char temp = ch[j];
			ch[j] = ch[i];
			ch[i] = temp;
			i++;
			j--;
			return recurcivCall(ch, i, j);
		} else {
			return ch;
		}
	}
}
