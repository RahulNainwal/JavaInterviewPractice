package polymorphism;
// autoboxing and widening
class A {
	public int add(int x) {
		return x-1;
	}
}

class B extends A {
	public int add(Integer y) {
		return y+1;
	}
}

public class PolymorphismTest1 {
	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.add(10));
		System.out.println(b.add(new Integer(10)));
	}
}
