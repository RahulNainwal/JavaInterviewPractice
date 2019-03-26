package globallogic;

public class Palindrom {
	public static void main(String[] args) {

		/*String s1 = "arcrbc";
		String s2 = "ar";*/

		
		  String s1 = "aaaaaa"; String s2 = "bb";
		 
		char ch[] = s1.toCharArray();
		char ch1[] = s2.toCharArray();
		if (ch1.length % 2 == 0) {
			int length = ch.length - 1, count = 0;
			for (int i = 0; i < ch.length; i++) {
				if (i < ch1.length) {

					ch[i] = ch1[i];
					ch[length] = ch1[i];
					length--;
					count++;
					//System.out.println(new String(ch));
				} else {
					if (i<=length) {
						ch[length] = ch[i];
						length--;
						count++;
					}
				}
			}
			System.out.println(count);
		} else {
			int length = ch.length - 1, chka = 0, count = 0;
			for (int i = 0; i < ch.length; i++) {
				if (i < (ch.length / ch1.length)) {
					if (ch[i] == ch[length]) {
						continue;
					} else {
						ch[length] = ch[i];
						length--;
						count++;
					}
				} else {
					if (chka < ch1.length) {
						ch[i] = ch1[chka];
						chka++;
						count++;
					}
				}
			}
			//System.out.println(count);
		}
		System.out.println(new String(ch));
	}
}
