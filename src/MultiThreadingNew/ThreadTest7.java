package MultiThreadingNew;

// Every main thread has default priority is 5. and every child thread has default priority as parent;
class TestThread extends Thread {
	@Override
	public void run() {

	}
}

public class ThreadTest7 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getPriority()); // default
																	// priority
																	// is 5
		TestThread t = new TestThread();
		System.out.println(t.currentThread().getPriority());// same as parent
															// thread 5
		// now i am changing main thread priority
		Thread.currentThread().setPriority(8); // default priority is 8
		TestThread t1 = new TestThread();
		System.out.println(t1.currentThread().getPriority());// same as parent
																// thread 8
		Thread.currentThread().setPriority(15);// RE: IllegalArgumentException
	}
}
