package MultiThreadingNew;
class MyThread extends Thread{
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println("thread is Running"+i);
			myMethod();
		}
	}
	public void myMethod(){
			System.out.println("thread is running in method");
	}
}
public class ThreadTest1 {
public static void main(String[] args) {
	MyThread my = new MyThread();
	my.start();
	MyThread my1 = new MyThread();
	my1.start();
}
}
