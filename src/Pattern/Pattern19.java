package Pattern;

public class Pattern19 {
	public static void main(String[] args) {
		int n = 7;
		for (int i = 1; i < n; i++) {
			if (i <= (n / 2)) {
				for (int j = 1; j <= i; j++)
					System.out.print(" ");
				System.out.print("*");
				for (int k = n - i; k > i; k--) {
					System.out.print(" ");
				}
				System.out.println("*");
			}
			if (i == (n / 2) + 1) {
				for (int j = 1; j < n; j++)
					System.out.print("* ");
				System.out.println();
			}
		}
		for (int l = 1; l <= n / 2; l++) {
			for (int j = n / 2; j >= l; j--) {
				System.out.print(" ");
			}
			System.out.print("*");
			for (int k = 1; k < l * 2; k++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}

	}
}
