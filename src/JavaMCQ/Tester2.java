package JavaMCQ;

public class Tester2 extends Thread {
	int x = 9;
	public void run(){
		//System.out.println(this.x);
		this.x = 7;
		//System.out.println(this.x);
	}
public static void main(String[] args) {
	Tester2 t2 = new Tester2();
	//System.out.println(t2.x);
	t2.start();
	//System.out.println(t2.x);
	for(int i=0;i<5;i++){
		System.out.println(t2.x);
	}
}
}
