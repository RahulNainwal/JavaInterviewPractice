package Multithreading;

class Thread1 extends Thread{
	public void run(){
		for(int i=0;i<5;i++)
		System.out.println("Hello from 1 !!!");
	}
}
class Thread2 extends Thread{
	public void run(){
		for(int i=0;i<5;i++)
		System.out.println("Hello from 2 !!!");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class New1_MultiThreading {
	public static void main(String args[]){
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		t2.setPriority(1);
		t1.start();
		t2.start();
	}
}
