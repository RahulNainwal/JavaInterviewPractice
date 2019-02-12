package Pattern;

public class Pattern18 {
	public static void main(String[] args) {
		int x = 1;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % 2 == 0) {
					System.out.print(x + " ");
					x--;
				} else {
					System.out.print(x + " ");
					x++;
				}
			}
			System.out.println();
			if (i % 2 != 0) {
				x = x + i;
			} else {
				x = x + (i + 1);
			}
		}
	}
}
