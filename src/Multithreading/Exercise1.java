package Multithreading;

public class Exercise1 implements Runnable {
	public static void main(String args[]){
		// this is object of current class  thst we can't use in static block
		//Thread th = new Thread(this);
		Exercise1 ec1 = new Exercise1();
		
		
		/*Thread th = new Thread(ec1);
		th.start();*/
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Yes");
	}

}
