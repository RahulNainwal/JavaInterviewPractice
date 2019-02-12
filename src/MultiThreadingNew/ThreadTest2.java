package MultiThreadingNew;
class NewMy implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<5;i++)
		System.out.println("Thread 1");
		for(int i=0;i<5;i++)
			System.out.println("Thread 1 inner");
		System.out.println(Thread.currentThread());
		}
	}
class NewMy1 implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<5;i++)
		System.out.println("Thread 2");
	}
	
}
public class ThreadTest2 {
public static void main(String[] args) throws InterruptedException {
	NewMy ny = new NewMy();
	NewMy1 ny1 = new NewMy1();
	Thread th = new Thread(ny);
	Thread th1 = new Thread(ny1);
	th.start();
	//th.sleep(5000);
	//th.join(500);
	//System.out.println(th.currentThread());
	th1.start();
}
}
