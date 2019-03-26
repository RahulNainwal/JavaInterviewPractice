package GloballogicPractics;

/*
 Given two numbers a and b and we have to find out Nth number divisible by either a or b.
  Input will be given in the form of a, b, n.
  Input : 2 3 10
Output : 15
 */
public class NthNumber {
	public static void main(String[] args) {
		int i = 2, j = 2;
		int n = 10, num = 1, m = 1;
		int k = n;
		while (n != 0) {
			num = m * 2;
			num = m * 3;
			n = n - 2;
			m++;
		}
		System.out.println(k + " th number is " + num);
	}
}
