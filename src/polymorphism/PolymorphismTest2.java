package polymorphism;
//autoboxing and widening
class A1 {
	public int add(Integer y) {
		return y+1;
	}
}

class B1 extends A {
	public int add(int x) {
		return x-1;
	}
}

public class PolymorphismTest2 {
	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.add(10));
		System.out.println(b.add(new Integer(10)));
	}
}
