package constructor;

class Cons {
	int x;
	int y;

	private Cons(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println(x + " " + y);
	}

	public static Cons toDo(int x, int y) {
		return new Cons(x, y);
	}
}

public class SingletonTest {
	public static void main(String[] args) {
		Cons cons = Cons.toDo(12,18);
		Cons cons1 = Cons.toDo(20,40);
	}
}
