package String;

public class ReverseString {
	public static void main(String[] args) {
		String s = "Rahul Nainwal";
		char[] ch = s.toCharArray();
		int i = ch.length - 1, j = 0;
		System.out.println("Reverse of String without predefined method");
		while (i != j) {
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
			j++;
			i--;
		}
		System.out.println(String.valueOf(ch));
		System.out.println("");
		for (int x = s.length() - 1; x >= 0; x--) {
			System.out.print(s.charAt(x));
		}
	}
}