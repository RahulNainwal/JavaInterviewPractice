package MultiThreadingNew;

class ThreadTemp extends Thread {
	@Override
	public void run() {

		try {
			for (int i = 1; i < 10; i++) {
				System.out.println("Child Thread");
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			System.out.println("I am interrupted");
		}
	}
}

public class ThreadTest14 {
	public static void main(String[] args) {
		ThreadTemp t = new ThreadTemp();
		t.start();
		t.interrupt();
		for (int i = 1; i < 10; i++) {
			System.out.println("main");
		}
	}
}
