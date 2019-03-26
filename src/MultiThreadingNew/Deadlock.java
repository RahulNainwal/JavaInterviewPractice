package MultiThreadingNew;

class ThreadOne extends Thread {
	@Override
	public void run() {
		try {
			Thread.currentThread().join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 1; i < 5; i++) {
			System.out.println("Child Thread");
		}
	}
}

public class Deadlock {
	public static void main(String[] args) throws InterruptedException {
		ThreadOne th = new ThreadOne();
		th.start();
		th.join();
		for (int i = 1; i < 5; i++) {
			System.out.println("main thread");
		}
	}
}
