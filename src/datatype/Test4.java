package datatype;

class Add {
	public int add(int a, int b) {
		a = a+b;
		b = b+b;
		System.out.println(a+" "+b);
		return a + b;
	}
}
class Add1 {
	public Integer add(Integer a, Integer b) {
		a = a+b;
		b = b+b;
		System.out.println(a+" "+b);
		return a + b;
	}
}

public class Test4 {
	public static void main(String[] args) {
		int a = 10,b=20;
		Add add = new Add();
		System.out.println(add.add(a, b));
		System.out.println(a+" "+b);
		Integer x=11,y=15;
		Add1 add1 = new Add1();
		System.out.println(add1.add(x, y));
		System.out.println(x+" "+y);
	}
}
