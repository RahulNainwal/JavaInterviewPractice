package InnovationM;
// first 6 number of series
public class FibonacciSeries {
	public static void main(String[] args) {
		int i = 0, j = 1, count = 6;
		while (count > 0) {
			int temp = i + j;
			i = j;
			j = temp;
			count--;
			System.out.println(i);
		}
	}
}
