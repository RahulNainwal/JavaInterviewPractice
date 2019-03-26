package MultiThreadingNew;

class ChildThread extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("thread " + i);
		}
	}
}

public class ThreadTest3 {
	public static void main(String[] args) {
		ChildThread ct = new ChildThread(); 
		ct.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Mobile No");
		}
	}
}
