package MultiThreadingNew;
// program to illustrate wait() and notify() in thread
class O3 extends Thread {
	int total = 0;

	@Override
	public void run() {
		synchronized (this) {
			System.out.println("Child thread start communication"); // 2 statement of execution
			for (int i = 1; i < 50; i++) {
				total += i;
			}
			System.out.println("Child threadm trying to give notification");//3 statement of execution
			this.notify();
		}
	}
}

public class ThreadCommunication2 {
	public static void main(String[] args) throws InterruptedException {
		O3 o = new O3();
		o.start();
		//o.sleep(1000); // focus on this line after calling wait there is no one to notify main thread because child thread is already executed and is in dead state.
		synchronized (o) {
			System.out.println("Main thread tring to call main thread");//1 statement of execution
			o.wait();
			System.out.println("Main thread got notifyed");//4 statement of execution
			System.out.println("Sum " + o.total);//5 statement of execution
		}
	}
}