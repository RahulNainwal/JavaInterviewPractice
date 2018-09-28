package MultiThreadingNew;

import java.util.Scanner;

class Add implements Runnable{
	int x,y,sum;
	public Add(int x, int y) {
		this.x = x;
		this.y = y;
		}
	@Override
	public void run() {
		sum = x + y;
		System.out.println("Sum :"+(x+y));
	}
}

class Substract implements Runnable{
	int x,y,subs;
	public Substract(int x, int y) {
		this.x = x;
		this.y = y;
		}
	@Override
	public void run() {
		subs = x - y;
		System.out.println("Substraction :"+subs);
	}
}

class Multiply implements Runnable{
	int x,y,multi;
	public Multiply(int x, int y) {
		this.x = x;
		this.y = y;
		}
	@Override
	public void run() {
		multi = x * y;
		System.out.println("Multiplication :"+multi);	
		}
}

class Divison implements Runnable{
	int x,y,divison;
	public Divison(int x, int y) {
		this.x = x;
		this.y = y;
		}
	@Override
	public void run() {
		divison = x / y;
		System.out.println("Divison :"+divison);
	}
}

public class MainClass {
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	/*System.out.println("Enter first number");
	int x = sc.nextInt();
	System.out.println("Enter second number");
	int y = sc.nextInt();*/
	int x = 245;
	int y = 45;
	Add data = new Add(x,y);
	Thread th1 = new Thread(data);
	Substract sb = new Substract(x, y);
	Thread th2 = new Thread(sb);
	Multiply multi = new Multiply(x,y);
	Thread th3 = new Thread(multi);
	Divison divison = new Divison(x, y);
	Thread th4 = new Thread(divison);
	
	th1.start();
	th2.start();
	th3.start();
	th4.start();
}

}

