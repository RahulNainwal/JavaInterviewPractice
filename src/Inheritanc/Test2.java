package Inheritanc;
// demonstrste that final class can't be inherited.
 final class Q{
	int m;
}
class W extends Q{
	int n;
	int m = 20;
	public void display(){
		System.out.println(this.m+" "+n);	
	}
}
public class Test2 {
public static void main(String[] args) {
	W w = new W();
	w.display();
	
}
}
