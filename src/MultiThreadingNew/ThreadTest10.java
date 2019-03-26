package MultiThreadingNew;

class Thre extends Thread {
	@Override
	public void run() {
		for (int i = 1; i < 10; i++) {
			System.out.println("Child Thread");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ThreadTest10 {
	public static void main(String[] args) throws InterruptedException {
		Thre th = new Thre();
		th.start();
		th.join();// main thread will wait until child thread completed its execution.
		for (int i = 1; i < 10; i++) {
			System.out.println("main thread");
		}
	}
}
