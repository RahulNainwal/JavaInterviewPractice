package MultiThreadingNew;

class Threadt extends Thread {
	public static Thread myVar;

	@Override
	public void run() {
		try {
			myVar.join();
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		for (int i = 1; i < 10; i++) {
			System.out.println("Child Thread");
		}
	}
}

public class ThreadTest11 {
	public static void main(String[] args) throws InterruptedException {
		Threadt.myVar = Thread.currentThread();
		Threadt th = new Threadt();
		th.start();
		th.join(); // after putting this line program will enter in deadlock state.
		for (int i = 1; i < 10; i++) {
			System.out.println("Main Thread");
			Thread.sleep(2000);
		}
	}
}
