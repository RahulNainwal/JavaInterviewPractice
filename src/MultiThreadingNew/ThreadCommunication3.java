package MultiThreadingNew;
// to overcome from last program problem we use wait with specify time so that if there is no one to notify us program start its execution after specify time
// this also prevent our program to enter into infinity state. 
class O4 extends Thread {
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

public class ThreadCommunication3 {
	public static void main(String[] args) throws InterruptedException {
		O4 o = new O4();
		o.start();
		o.sleep(1000); 
		synchronized (o) {
			System.out.println("Main thread tring to call main thread");//1 statement of execution
			o.wait(1000); // that is the specified time of 10sec.
			// if it will not get notified within 10sec it will start executing main thread.
			System.out.println("Main thread got notifyed");//4 statement of execution
			System.out.println("Sum " + o.total);//5 statement of execution
		}
	}
}
