package Multithreading;

public class OneThread extends Thread {
	public void run(){
		System.out.println("Thread is Running.........");
	}

	public static void main(String[] args){
		OneThread  th = new OneThread();
		th.run();
	}
}
