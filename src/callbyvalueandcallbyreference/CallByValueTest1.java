package callbyvalueandcallbyreference;

public class CallByValueTest1 {
	int x = 30, y = 60;

	public void data9(int x, int y) {
		x = 20;
		y = 40;
	}

	public static void main(String[] args) {
		CallByValueTest1 c = new CallByValueTest1();
		System.out.println("Before call X: " + c.x + " y: " + c.y);
		c.data9(c.x, c.y);
		System.out.println("After call X: " + c.x + " y: " + c.y);
	}
}
