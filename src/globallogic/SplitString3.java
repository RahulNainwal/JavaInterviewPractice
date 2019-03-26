package globallogic;

public class SplitString3 {
	public static void main(String[] args) {
		SplitString3 s = new SplitString3();
		s.generateLexicoString(3, 25);
	}

	public void generateLexicoString(int n, int k) {
		char[] a = new char[n];
		// Initially fill the array with character 'a'
		for (int i = 0; i < n; i++) {
			a[i] = 'a';
		}
		int a_count = n;
		int tot_count = k;
		int x = tot_count - a_count;
		for (int i = n - 1; i >= 0; i--) {
			if (x > 26) {
				a[i] = 'z';
				x = (x - 26) + 1;
			} else if (x > 0) {
				a[i] = (char) (a[i] + x);
				x = 0;
			}
			if (x == 0)
				break;
		}
		String op = "";
		for (int i = 0; i < n; i++) {
			op = op + a[i];
		}
		System.out.println(op);
	}
}
