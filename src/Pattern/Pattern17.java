package Pattern;

public class Pattern17 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			int l = 0, m = 1;
			for (int j = 1; j <= i; j++) {
				if (i % 2 == 0) {
					System.out.print(l + " ");
					if (l == 0) {
						l++;
					} else {
						l--;
					}
				} else {
					System.out.print(m + " ");
					if (m == 1) {
						m--;
					} else {
						m++;
					}
				}
			}
			System.out.println();
		}
	}
}
