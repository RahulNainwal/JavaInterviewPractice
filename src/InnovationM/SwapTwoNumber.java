package InnovationM;

public class SwapTwoNumber {
	public static void main(String[] args) {
		int x = 10, y = 30;
		System.out.println(x + " " + y);
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println(x + " " + y);
	}
}
