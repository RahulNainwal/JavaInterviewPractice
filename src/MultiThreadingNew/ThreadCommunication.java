package MultiThreadingNew;

class O1 extends Thread {
	int total = 0;

	@Override
	public void run() {
		for (int i = 1; i < 50; i++) {
			total += i;
			System.out.println(total);
		}
	}
}

public class ThreadCommunication {
	public static void main(String[] args) throws InterruptedException {
		O1 o = new O1();
		o.start();
		// not recommended 
		//Thread.sleep(1000);
		//Thread.join();
		System.out.println("Sum "+o.total);;
	}
}
