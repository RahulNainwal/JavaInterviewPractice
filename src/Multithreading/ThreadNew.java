package Multithreading;


class A implements Runnable{

	@Override
	public void run() {
		System.out.println("Hi A");
		
	}
	
}
class B implements Runnable{


	@Override
	public void run() {
		System.out.println("Hi B");		
	}
	
}
public class ThreadNew {
	public static void main(String args[]){
		Runnable rb;
		
		rb = new B();
		//rb = new A();
		Thread th = new Thread(rb);
		th.start();
	}
}
