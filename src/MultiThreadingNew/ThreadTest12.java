package MultiThreadingNew;

class Thrd extends Thread {
	@Override
	public void run() {

		for (int i = 1; i < 5; i++) {
			try {
				Thread.sleep(1000);

				System.out.println("child thread");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	} 
}

public class ThreadTest12 {
	public static void main(String[] args) throws InterruptedException {
		Thrd th = new Thrd();
		th.start();
		for (int i = 1; i < 5; i++) {
			th.sleep(1000);
			System.out.println("main thread");
		}
	}

}
