package franconnect;

public class SortArrayOfString {
	public static void main(String[] args) {
		String[] str = new String[] { "my", "name", "is", "rahul","nainwal"};
		System.out.println("Sortd array of string is ");
		for(String s:SortArrayOfString.sortString(str)){
			System.out.print(s+" ");
		}
	}

	public static String[] sortString(String[] str) {
		int x = 0;
		for (int i = 0; i < str.length - 1; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].charAt(x) > str[j].charAt(x)) {
					String temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
		return str;
	}
}
