package MultiThreadingNew;

class One {
	public synchronized void display(String s) {
		for (int i = 1; i <= 10; i++) {
			System.out.print("Hello Welcome");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}
			System.out.println(s);
		}
	}
}

class NewOne extends Thread {
	One one;
	String s;

	public NewOne(One one, String s) {
		this.one = one;
		this.s = s;
	}

	@Override
	public void run() {
		one.display(s);
	}
}

public class Synchronization {
	public static void main(String[] args) {
		One one = new One();
		// There is a slight difference between passing same object or passing new One() it will produce irregular output;
		/*
		 * NewOne no = new NewOne(new One(), "Rahul"); NewOne no1 = new // in this case it will consider it as a separate new thread
		 * NewOne(new One(), "KL Rahul"); no.start(); no1.start();
		 */
		
		// this will produce regular output
		NewOne no = new NewOne(one, "Rahul");
		NewOne no1 = new NewOne(one, "KL Rahul");
		no.start();
		no1.start();
	}
}
