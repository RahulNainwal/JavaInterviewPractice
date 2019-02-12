package InnovationM;

public class LengthOfNumber {
	public static void main(String[] args) {
		int x = 5452;
		int count = 0;
		while (x % 10 != 0) {
			count++;
			x = x / 10;
		}
		System.out.println(count);
	}
}
