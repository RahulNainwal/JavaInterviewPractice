package MultiThreadingNew;

class Thread4 extends Thread {

	public void start() {
		super.start();
	}

	// it will consider run() as user defined method.
	public void run() {

		System.out.println(Thread.currentThread().getName());//Child Thread
		for (int i = 1; i < 10; i++) {
			System.out.println("1 " + i);
		}
	}
}

public class ThreadTest6 {
	public static void main(String[] args) {
		Thread4 t = new Thread4();
		t.start();
		System.out.println(Thread.currentThread().getName());// Main Thread
	}
}
