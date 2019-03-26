package MultiThreadingNew;

class OneThread {
	public synchronized void add(String s, TwoThread to) {
		System.out.println("OneThread first method is running");
		to.last();
		System.out.println("After last method of TwoThread");
	}

	public synchronized void last() {
		System.out.println("Last method of OneThread is running");
	}
}

class TwoThread {
	public synchronized void add(String s, OneThread to) {
		System.out.println("TwoThread first method is running");
		to.last();
		System.out.println("After last method of OneThread");
	}

	public synchronized void last() {
		System.out.println("Last method of TwoThread is running");
	}
}

class Mythread1 extends Thread {
	OneThread one = new OneThread();
	TwoThread two = new TwoThread();

	public void myMethod() {
		this.start(); 
		one.add("rahul", two);// will be executed by Main thread.
	}

	@Override
	public void run() {
		two.add("rohan", one);
	}

}

public class Deadlock1 {
	public static void main(String[] args) {
		Mythread1 my = new Mythread1();
		my.myMethod();
	}
}
