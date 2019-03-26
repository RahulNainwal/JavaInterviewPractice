package MultiThreadingNew;

class Thr extends Thread {
	@Override
	public void run() {
		Thread.yield();
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
	}
}

public class ThreadTest9 {
	public static void main(String[] args) {
		Thr thr = new Thr();
		thr.start();
		for (int i = 1; i < 10; i++) {
			System.out.println("Main Thread");
		}
	}
}
