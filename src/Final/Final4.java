package Final;

final class Bike {
}
// final class can't inherit.
public class Final4 extends Bike {
	void run() {
		System.out.println("running safely with 100kmph");
	}

	public static void main(String args[]) {
		Final4 honda = new Final4();
		honda.run();
	}
}