package MultiThreadingNew;

// creating on thread inside another 
class Th extends Thread {
	@Override
	public void run() {
		for (int i = 1; i < 10; i++) {
			System.out.println("Child Thread");
		}
	}
}

public class ThreadTest8 {
	public static void main(String[] args) {
		Th th = new Th();
		th.setPriority(10);
		th.start();
		/*
		 * System.out.println("child"+th.getPriority());
		 * System.out.println(Thread.currentThread().getPriority());
		 */
		for (int i = 1; i < 10; i++) {
			System.out.println("Main Thread");
		}
	}
}
