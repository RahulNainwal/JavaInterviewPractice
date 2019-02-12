package polymorphism;

//autoboxing and widening
class A2 {
	public float add(Float y) {
		return y + 1;
	}

	/*public float add(int y) {
		return y + 2;
	}*/
}

class B2 extends A2 {
	/*
	 * public float add(float x) { return x-1; }
	 */
	/*public float add(float x) {
		return x - 1;
	}*/
	/*public float add(Integer y) {
		return y+5;
	}*/
}

public class PolymorphismTest3 {
	public static void main(String[] args) {
		B2 b1 = new B2();
		System.out.println(b1.add(20));
	}
}
