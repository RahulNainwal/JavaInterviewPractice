package Inheritanc;

class A{
	int x=10;
	public void show(){
		System.out.println("running in superclass");
	}
}
class B extends A{
	int x = 11;
	// remove comment to check output
	
	/*public void show(){
		System.out.println("Running in main");
	}*/
}

// NOTE: when we extend a super class which contains static method if we override the same method in subclass then the 
// superclass method hide .
public class Test extends A {
public static void main(String[] args) {
	A a = new A();
	B b = new B();
	System.out.println(b.x);
	a.show();
	b.show();
}
}
