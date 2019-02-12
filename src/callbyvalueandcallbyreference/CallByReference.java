package callbyvalueandcallbyreference;
public class CallByReference {
	int x = 40, y = 50;
	public void data(CallByReference obj) {
		obj.x = 100;
		obj.y = 300;
	}
	public static void main(String[] args) {
		CallByReference c = new CallByReference();
		System.out.println("Before X: " + c.x + " Y: " + c.y);
		c.data(c);
		System.out.println("After X: " + c.x + " Y: " + c.y);
	}
}
