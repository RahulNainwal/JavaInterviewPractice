package MultiThreadingNew;

class Thread3 extends Thread {
	
	public void start() {
		super.start();
	}

	// it will consider run() as user defined method.
	public void run() {
		for (int i = 1; i < 10; i++) {
			System.out.println("1 " + i);
		}
	}
}


public class ThreadTest5 {
	public static void main(String[] args) {
		Thread3 t = new Thread3();
		t.start();
		Thread3 t1 = new Thread3();
		t1.start();
	}
}
