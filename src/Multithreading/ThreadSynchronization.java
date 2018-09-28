package Multithreading;
class Increment{
	int count;
	// synchronized keyword is used here
	public synchronized void Count(){
	 count++;
	}
}

public class ThreadSynchronization {
	public static void main(String args[]) throws InterruptedException{
		Increment in = new Increment();
		// anonymous class
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
			for(int i=1;i<=1000;i++)
				in.Count();
			}
		});
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=1;i<=1000;i++)
				in.Count();
			}
		});
		
		t1.start();
		t2.start();
		// join is used here (until t1 is executing t2 will wait for t1 completion);
		t1.join();
		t2.join();
		System.out.println("Count "+in.count);
	}
}
