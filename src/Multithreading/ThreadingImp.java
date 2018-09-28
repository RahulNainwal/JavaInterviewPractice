package Multithreading;

class One1 extends Thread{
	public void one(){
		for(int i=1;i<=5;i++)
		System.out.println("Rahul one is running");
	}
}
class Two extends Thread{
	public void two(){
		for(int i=1;i<=5;i++)
		System.out.println("Rahul two is running");
	}
}
public class ThreadingImp {
	public static void main(String[] args) {
		One1 one = new One1();
		Two two = new Two();
		one.one();
		two.two();
	}

}
