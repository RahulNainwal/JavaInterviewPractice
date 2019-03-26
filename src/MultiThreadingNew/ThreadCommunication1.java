package MultiThreadingNew;
// this program is to illustrate that wait and notify are used within synchronized block only otherwise it will throws java.lang.IllegalMonitorStateException
class O2 extends Thread {
	int total = 0;

	@Override
	public void run() {
		for (int i = 1; i < 50; i++) {
			total += i;
		}
		this.notify();
	}
}

public class ThreadCommunication1 {
	public static void main(String[] args) throws InterruptedException {
		O2 o = new O2();
		o.start();
		o.wait();
		System.out.println("Sum " + o.total);
		;
	}
}
