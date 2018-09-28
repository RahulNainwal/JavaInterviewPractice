package Multithreading;

public class Thread_Testing2 extends Thread {
	public void run(){
		for(int i=1;i<=5;i++){
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				System.out.println(e);
			}
			System.out.println(i); 
		}
	}
	public static void main(String args[]){
		Thread_Testing2 t1 = new Thread_Testing2();
		Thread_Testing2 t2 = new Thread_Testing2();
		//t1.start();
		//t2.start();
		t1.start();
		try{
			t1.join();
		}catch(Exception e){
			System.out.println(e);
		}
		t2.start();
		
	}
}
