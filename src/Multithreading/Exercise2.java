package Multithreading;

public class Exercise2 {
	public static void main(String args[]){
		Exercise2 t1 = new Exercise2();
	}
	public void Exercise2(){
		Thread th = new Thread();
		th.start();
	}
	public void run(){
		System.out.println("Running ....");
	}
}
