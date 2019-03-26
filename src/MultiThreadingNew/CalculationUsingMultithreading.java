package MultiThreadingNew;

class Add1 extends Thread {
	public void run() {
		int x = 2;
		for (int j = 1; j <= 10; j++) {
			System.out.println(x +"*"+" "+j+" = "+x );
			x=x+2;
		}
	}
}
class Add2 extends Thread {
	public void run() {
		int x = 2;
		for (int j = 1; j <= 10; j++) {
			System.out.println("Add2"+ x +"*"+" "+j+" = "+x );
			x=x+2;
		}
	}
}

public class CalculationUsingMultithreading {
	public static void main(String[] args) {
		Add1 add1 = new Add1();
		add1.start();
		Add2 add2 = new Add2();
		add2.start();
	}
}
