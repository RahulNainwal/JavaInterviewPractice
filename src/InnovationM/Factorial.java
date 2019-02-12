package InnovationM;

public class Factorial {
	public static int fact(int i) {
		
		if (i == 1) {
			return 1;
		} else {
			return i * fact(i - 1);
		}
	}

	public static void main(String[] args) {
		int x = 4;
		System.out.println(Factorial.fact(x));
		;
	}
}
