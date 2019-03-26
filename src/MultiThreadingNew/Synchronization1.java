package MultiThreadingNew;

class Sync {
	public void wish() {
		// synchronized (this) { // this will allow only one thread to run at a one time // synchronized block
		for (int i = 1; i < 10; i++) {

			System.out.print("Good ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Running automaically");
		}
		// }
	}
}

class MyThread1 extends Thread {
	Sync d;
	String name;

	public MyThread1(Sync d, String name) {
		this.d = d;
		this.name = name;
	}

	@Override
	public void run() {
		d.wish();
	}

}

public class Synchronization1 {
	public static void main(String[] args) {
		Sync sync = new Sync();
		MyThread1 mt = new MyThread1(sync, "rahul");
		mt.start();
		MyThread1 mt1 = new MyThread1(sync, "rahul");
		mt1.start();
	}
}
