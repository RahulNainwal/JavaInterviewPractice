package GloballogicPractics;

import java.util.Scanner;

/*
 Given n, which is the number of strings taken as input. 
 For each input use have to print “YES” or “NO” whether the current string is already present or not.
 */
public class StringPresent {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array ");
		int size = sc.nextInt();
		String[] str = new String[size];
		for (int i = 0; i < size; i++) {
			str[i] = sc.next();
		}
		for (int i = 0; i < size; i++) {
			if (i == 0) {
				System.out.println("NO");
			} else {
				int m = i - 1, count = 0;
				while (m >= 0) {
					if (str[i].equals(str[m])) {
						count++;
						break;
					}
					m--;
				}
				if (count == 1)
					System.out.println("YES");
				else
					System.out.println("NO");
			}
		}
	}
}
