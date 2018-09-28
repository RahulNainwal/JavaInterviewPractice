package Multithreading;

class One11 extends Thread{
	public void run(){
		for(int i=1;i<=5;i++)
		System.out.println("Rahul one is running");
	}
}
class Two2 extends Thread{
	public void run(){
		for(int i=1;i<=5;i++)
		System.out.println("Rahul two is running");
	}
}

public class ThreadingImp2 {
	public static void main(String[] args) throws InterruptedException {
		One11 one = new One11();
		Two2 two = new Two2();
		System.out.println(one.currentThread());
		one.start();
		two.start();
	}

}

