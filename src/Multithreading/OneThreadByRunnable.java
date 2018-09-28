package Multithreading;

public class OneThreadByRunnable implements Runnable {
	public void run(){
		System.out.println("Running.........");
	}
	public static void main(String args[]){
		OneThreadByRunnable one = new OneThreadByRunnable();
		Thread th = new Thread(one);
		th.run();
	}

}
