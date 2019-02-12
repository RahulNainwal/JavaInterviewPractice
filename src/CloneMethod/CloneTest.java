package CloneMethod;

class One {
	int x, y;

	public One(int x, int y) {
		System.out.println("IN Constructor.....");
		this.x = x;
		this.y = y;
	}

	One clone(One one) {
		return one;
	}
}

public class CloneTest {
	public static void main(String[] args) {
		int x = 30, y = 40;
		One one = new One(x, y);
		One x1 = one.clone(one);
		System.out.println(one.x + " " + one.y);
		System.out.println(x1.x + " " + x1.y);
		
	}
}
