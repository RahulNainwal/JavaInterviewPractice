package Multithreading;
class One extends Thread{
	public void run(){
		for(int i=0;i<2;i++){
			System.out.println(i);
		}
	}
}
public class Exercise3 {
	public static void main(String args[]){
		Exercise3 ec3 = new Exercise3();
		ec3.call(new One());
	}

	private void call(One one) {
		one.start();
	}

}
