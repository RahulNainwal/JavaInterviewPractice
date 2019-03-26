package MultiThreadingNew;

class Thread1 extends Thread {
	@Override
	public synchronized void start() {
		run();
	}

	// it will consider run() as user defined method.
	public void run() {
		for (int i = 1; i < 10; i++) {
			System.out.println("1" + i);
		}
	}
}

class Thread2 extends Thread {
	@Override
	public synchronized void start() {
		run();
	}

	// it will consider run() as user defined method.
	public void run() {
		for (int i = 1; i < 10; i++) {
			System.out.println(i);
		}
	}
}

public class ThreadTest4 {
	public static void main(String[] args) {
		Thread1 t = new Thread1();
		t.start();
		Thread2 t1 = new Thread2();
		t1.start();
	}
}
