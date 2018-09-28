package Multithreading;

public class Exercise4 {
	public static void main(String args[]){
		new1 n = new new1();
		Thread th = new Thread(n);
		th.start();
		th.start();
	}

}
class new1 implements Runnable{

	@Override
	public void run() {
		System.out.println("Go");
	}
	
}